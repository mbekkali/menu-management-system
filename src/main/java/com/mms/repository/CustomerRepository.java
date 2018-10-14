package com.mms.repository;

import com.mms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Modifying
    @Transactional
    @Query("update Customer customer set customer.name=:name where customer.id=:id")
    void updateCustomer(@Param("name") String name, @Param("id") Integer id);

}
