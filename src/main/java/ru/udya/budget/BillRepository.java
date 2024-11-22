package ru.udya.budget;

import org.springframework.data.repository.ListCrudRepository;

public interface BillRepository extends ListCrudRepository<Bill, Long> {
}