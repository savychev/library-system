package be.intec.library.repository;

import be.intec.library.domain.Loan;
import java.util.List;

public interface LoanRepository extends CrudRepository<Loan, String> {
    // Предлагаемый ключ: membershipNumber + ":" + isbn
    List<Loan> findByMembershipNumber(String membershipNumber);
    List<Loan> findByIsbn(String isbn);
}
