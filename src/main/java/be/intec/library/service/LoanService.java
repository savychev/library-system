package be.intec.library.service;

import be.intec.library.domain.Loan;
import java.util.Optional;

public interface LoanService {
    // выдать книгу: проверяем члена, книгу, доступные копии; уменьшаем availableCopies; ставим dueDate
    Optional<Loan> borrow(String membershipNumber, String isbn);

    // вернуть книгу: отмечаем возврат/overdue, увеличиваем availableCopies
    Optional<Loan> returnBook(String membershipNumber, String isbn);
}
