package com.utad.poo.tema7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpenCountryPopulationCsvFile {
	private Integer numLineas;
	private Integer numLineasCabecera;
	private List<Country> countries;
	public OpenCountryPopulationCsvFile() throws Exception{
		this(1);
	}
	public OpenCountryPopulationCsvFile(Integer numLineasCabecera) throws Exception {
		this.numLineas = 0;
		this.numLineasCabecera = numLineasCabecera;
		this.countries = this.leerFichero();
	}
	private List<Country> leerFichero() throws Exception{
		List<Country> countries = new ArrayList<Country>();
		File currentDir = new File(System.getProperty ("user.dir") );
		File ejemplo1File = new File(currentDir.getCanonicalPath()+"\\files\\countriesPopulation.csv");
		BufferedReader br  = new BufferedReader(new FileReader(ejemplo1File));
		String lineaDeFichero = null;
		Scanner scannerLine = null;
		this.saltarCabecera(br);
		while ((lineaDeFichero = br.readLine()) != null) {
			scannerLine = new Scanner(lineaDeFichero);
			scannerLine.useDelimiter(";");
			String countryName = scannerLine.next();
			String countryIsoCode = scannerLine.next();
			String countryContinente = scannerLine.next();
			String countryPoblacionEnMillones = scannerLine.next();
			Integer countryPoblacionNumerico = null;
			try {
				countryPoblacionNumerico = Integer.valueOf(countryPoblacionEnMillones);
				countries.add(new Country(countryName, countryIsoCode, countryContinente, countryPoblacionNumerico));
			}catch(Exception e) {
				countries.add(new Country(countryName, countryIsoCode, countryContinente, countryPoblacionEnMillones));
			}
			this.numLineas++;
		}
		br.close();
		return countries;
	}
	private void saltarCabecera(BufferedReader br) throws Exception {
		for(int i = 0; i < this.numLineasCabecera; i++) {
			br.readLine();
		}
	}
	public List<Country> getCountries() {
		return this.countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	public static void main(String[] args) throws Exception {
		OpenCountryPopulationCsvFile lector = new OpenCountryPopulationCsvFile(1);
		Collections.sort(lector.getCountries());
		for (Country country : lector.getCountries()) {
			System.out.println(country);
		}
		System.out.println("El pais con menor poblacion es: " + lector.getCountries().get(0).getNombre());
	}
}