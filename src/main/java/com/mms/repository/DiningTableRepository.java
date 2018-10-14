package com.mms.repository;

import com.mms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface DiningTableRepository extends JpaRepository<Customer, Integer> {

    @Modifying
    @Transactional
    @Query("update DiningTable diningTable set diningTable.name=:name where diningTable.id=:id")
    void updateDiningTable(@Param("name") String name, @Param("id") Integer id);

}
