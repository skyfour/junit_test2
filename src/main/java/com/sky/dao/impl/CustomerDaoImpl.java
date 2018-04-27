//package com.sky.dao.impl;
//
//import com.sky.beans.Customer;
//import com.sky.dao.CustomerDao;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.StringUtils;
//import org.elasticsearch.index.query.QueryBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.query.IndexQuery;
//import org.springframework.data.elasticsearch.core.query.SearchQuery;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//import static javafx.scene.input.KeyCode.T;
//
//@Slf4j
//@Repository
//public class CustomerDaoImpl implements CustomerDao {
//
//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;
//
//    @Override
//    public <S extends T> S index(S entity) {
//        return null;
//    }
//
//    @Override
//    public Iterable<Customer> search(QueryBuilder query) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> search(QueryBuilder query, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> search(SearchQuery searchQuery) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> searchSimilar(Customer entity, String[] fields, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public void refresh() {
//
//    }
//
//    @Override
//    public Class<Customer> getEntityClass() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Customer> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends T> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends T> Iterable<S> save(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Customer findOne(String s) {
//        return null;
//    }
//
//    @Override
//    public boolean exists(String s) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Customer> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Customer> findAll(Iterable<String> strings) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void delete(String s) {
//
//    }
//
//    @Override
//    public void delete(Customer entity) {
//
//    }
//
//    @Override
//    public void delete(Iterable<? extends Customer> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<Customer> findByFirstName(String firstName) {
//        return null;
//    }
//
//    @Override
//    public List<Customer> findByLastName(String lastName) {
//        return null;
//    }
//}
