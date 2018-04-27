package com.sky.dao;

import com.sky.beans.Customer;
import com.sky.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestServiceApplication.class)
public class CustomerDaoTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerDao repository;

    @Test
    public void testSave() {
        Customer ct = new Customer();
        ct.setId("1");
        ct.setFirstName("1");
        ct.setLastName("1");
        repository.save(ct);
    }
}

