package com.mms.repository;

import com.mms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface KitchenRepository extends JpaRepository<Customer, Integer> {

    @Modifying
    @Transactional
    @Query("update Kitchen kitchen set kitchen.name=:name where kitchen.id=:id")
    void updateKitchen(@Param("name") String name, @Param("id") Integer id);

}
