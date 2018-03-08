package com.mf.gs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mf.gs.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}