package be.intec.library.domain;

import java.time.LocalDate;

public class Loan {
    private String membershipNumber;
    private String isbn;
    private LocalDate dueDate;
    private LoanStatus status = LoanStatus.ACTIVE;

    public Loan() { }

    public Loan(String membershipNumber, String isbn, LocalDate dueDate) {
        this.membershipNumber = membershipNumber;
        this.isbn = isbn;
        this.dueDate = dueDate;
    }

    public String getMembershipNumber() { return membershipNumber; }
    public void setMembershipNumber(String membershipNumber) { this.membershipNumber = membershipNumber; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public LoanStatus getStatus() { return status; }
    public void setStatus(LoanStatus status) { this.status = status; }
}
