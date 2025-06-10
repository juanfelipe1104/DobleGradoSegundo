package com.utad.ds.observer.pushpull.library;

import com.utad.ds.observer.pushpull.Observer;

public class Test {
	public static void main(String[] args) {
		Library library = new Library();
		Observer stock = new StockDepartmentObserver();
		Observer administration = new AdminDepartmentObserver();
		Observer sales = new SalesDepartmentObserver();
		library.attach(stock);
		library.attach(administration);
		library.attach(sales);
		Book badBook = new Book("Programar sin patrones","desconocido",BookState.BAD);
		Book goodBook = new Book("Programar con patrones","pepe",BookState.GOOD);
		Book anotherBadBook = new Book("Programar sin pensar", "desconocido", BookState.BAD);
		library.returnBook(goodBook);
		library.returnBook(badBook);
		library.detach(sales);
		library.returnBook(anotherBadBook);
	}
}