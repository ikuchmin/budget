package ru.udya.budget;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.HashSet;
import java.util.Set;

@Table("bill")
public class Bill {

    @Id
    private Long id;

    private Set<BillItem> billItems = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(Set<BillItem> billItems) {
        this.billItems = billItems;
    }

    @Override
    public String toString() {
        return "Bill{" +
               "id=" + id +
               '}';
    }
}