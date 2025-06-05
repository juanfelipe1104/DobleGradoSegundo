package com.utad.ds.state.library;

import com.utad.ds.observer.pushpull.library.Book;
import com.utad.ds.observer.pushpull.library.BookState;

public class Test {
	public static void main(String[] args) {
        LoansLibrary library = LoansLibrary.getInstance(); // singleton
        Book bookGood = new Book("Gang of four Design patterns", "Gang of four", BookState.GOOD);
        LibraryUser professor = new LibraryUser("MA",
            "miguel.mesas@u-tad.com", UserType.PROFESSOR, true);
        LibraryUser student = new LibraryUser("Inés",
            "ines@live.u-tad.com", UserType.STUDENT, true);
        LibraryLoanRequestContext professorLoanRequest
            = new LibraryLoanRequestContext(bookGood, professor);
        LibraryLoanRequestContext studentLoanRequest
            = new LibraryLoanRequestContext(bookGood, student);
        //La biblioteca gestiona las reservas recién creadas
        library.processLibraryLoan(studentLoanRequest);
        library.processLibraryLoan(professorLoanRequest);
        //La biblioteca gestiona la recogida del libro del docente.
        library.processLibraryLoan(professorLoanRequest);
        //La biblioteca gestiona la recogida del libro del alumno.
        library.processLibraryLoan(studentLoanRequest);
        //La biblioteca gestiona la devolución del libro del alumno.
        library.returnBook(studentLoanRequest.getBook(), studentLoanRequest);
        //La biblioteca gestiona la devolución del libro del docente.
        library.returnBook(professorLoanRequest.getBook(), professorLoanRequest);
    }
}
