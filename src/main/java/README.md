# Library System

## Goal
Educational project: simple library system with Maven, IntelliJ, GitHub, Trello (Scrum workflow).

## Packages
- `be.intec.library.domain` — data classes (Book, Member, Loan, LoanStatus).
- `be.intec.library.repository` — repository interfaces (CRUD).
- `be.intec.library.service` — service interfaces (business logic).
- `be.intec.library.cli` — simple CLI app with menu.

## How to Run
```bash
mvn -q compile
mvn -q exec:java
