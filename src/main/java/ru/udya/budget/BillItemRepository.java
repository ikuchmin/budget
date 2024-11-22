package ru.udya.budget;

import org.springframework.data.repository.ListCrudRepository;

public interface BillItemRepository extends ListCrudRepository<BillItem, Long> {
}