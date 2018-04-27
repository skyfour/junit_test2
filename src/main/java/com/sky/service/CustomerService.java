package com.sky.service;

import com.sky.beans.Customer;
import com.sky.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void saveCustomers() throws IOException {
        customerDao.save(new Customer("Alice", "Smith"));
        customerDao.save(new Customer("Bob", "Smith"));
    }

    public void fetchAllCustomers() throws IOException {

    }

    public void fetchIndividualCustomers() {
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(customerDao.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : customerDao.findByLastName("Smith")) {
            System.out.println(customer);
        }
    }
}

