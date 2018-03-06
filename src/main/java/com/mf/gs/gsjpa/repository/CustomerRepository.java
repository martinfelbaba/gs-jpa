package com.mf.gs.gsjpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mf.gs.gsjpa.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}