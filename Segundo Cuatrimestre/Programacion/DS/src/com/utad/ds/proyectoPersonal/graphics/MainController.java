package com.utad.ds.proyectoPersonal.graphics;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;

import com.utad.ds.proyectoPersonal.common.Itinerary;
import com.utad.ds.proyectoPersonal.common.Trip;
import com.utad.ds.proyectoPersonal.decorator.CustomTripComponent;
import com.utad.ds.proyectoPersonal.facade.TravelFacade;
import com.utad.ds.proyectoPersonal.observer.Client;
import com.utad.ds.proyectoPersonal.observer.Reservation;
import com.utad.ds.proyectoPersonal.strategy.EconomicItinerary;
import com.utad.ds.proyectoPersonal.strategy.FastItinerary;
import com.utad.ds.proyectoPersonal.strategy.TouristicItinerary;

public class MainController {
    @FXML private TextField textFieldDestiny;
    @FXML private DatePicker datePickerDeparture, datePickerReturn;
    @FXML private ComboBox<String> comboBoxType;
    @FXML private CheckBox checkInsurance, checkGuide, checkTransport;
    @FXML private TextArea textAreaResult;
    @FXML private Label labelEstado;
    @FXML private ListView<String> listViewNotificaciones;
    private TravelFacade facade;
    private Client client;
    private Reservation reservation;
    public MainController() {
    	this.facade = new TravelFacade();
    	this.client = new Client("juan", "juan@email.com");
    }
    @FXML
    public void initialize() {
        this.comboBoxType.getItems().addAll("Economic", "Touristic", "Fast");
    }

    @FXML
    private void onGenerar() {
        try {
        	Trip trip = this.facade.createTrip(this.textFieldDestiny.getText(), this.datePickerDeparture.getValue(), this.datePickerReturn.getValue());
            this.chooseStrategy();
        	List<String> extras = new ArrayList<>();
            this.checkBlankAndAdd(this.checkInsurance, "insurance", extras);
            this.checkBlankAndAdd(this.checkGuide, "guide", extras);
            this.checkBlankAndAdd(this.checkTransport, "transport", extras);
            CustomTripComponent adaptedTrip = this.facade.createCustomTrip(trip, extras);
            Itinerary itinerario = this.facade.createItinerary(adaptedTrip);
            this.textAreaResult.setText(itinerario.getResumenTexto());
            this.reservation = new Reservation(this.textFieldDestiny.getText(), this.client);
        } catch (Exception e) {
            textAreaResult.setText("Error: " + e.getMessage());
        }
    }
    private void checkBlankAndAdd(CheckBox checkBox, String message, List<String> extras) {
    	if(checkBox.isSelected()) {
    		extras.add(message);
    	}
    }
    private void chooseStrategy() {
    	switch (this.comboBoxType.getValue().toLowerCase()) {
        case "touristic":
        	this.facade.getItineraryPlanner().setItineraryStrategy(new TouristicItinerary());
        break;
        case "fast":
        	this.facade.getItineraryPlanner().setItineraryStrategy(new FastItinerary());
        break;
        case "economic":
        	this.facade.getItineraryPlanner().setItineraryStrategy(new EconomicItinerary());
        break;
    	}
    }
    @FXML
    private void onAvanzarEstado() {
    	this.reservation.advance();
        this.updateUIEstadoYNotificaciones();
    }
    private void updateUIEstadoYNotificaciones() {
        this.labelEstado.setText(this.reservation.getClass().getSimpleName().replace("State", ""));
        this.listViewNotificaciones.getItems().setAll(this.client.getNotifications());
    }
}
