package com.sky.dao;

import com.sky.beans.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerDao extends ElasticsearchRepository<Customer,String> {
    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
