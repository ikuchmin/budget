package ru.udya.budget;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BillRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(BillRepositoryTest.class);
    @Autowired
    private BillRepository billRepository;

    @Test
    void checkCreatingBillWithItem() {
        BillItem billItem = new BillItem();
        billItem.setPositionName("Coconut");

        Bill bill = new Bill();
        bill.getBillItems().add(billItem);

        billRepository.save(bill);
    }

    @Test
    void checkBatchInsert() {

        var bills = new ArrayList<Bill>();
        for (int i = 0; i < 10; i++) {
            BillItem coconut = new BillItem();
            coconut.setPositionName("Coconut");

            BillItem milk = new BillItem();
            milk.setPositionName("MIlk");

            Bill bill = new Bill();
            bill.getBillItems().add(coconut);
            bill.getBillItems().add(milk);
            bills.add(bill);
        }

        List<Bill> bills1 = billRepository.saveAll(bills);

        log.info("{}", bills1);
    }
}