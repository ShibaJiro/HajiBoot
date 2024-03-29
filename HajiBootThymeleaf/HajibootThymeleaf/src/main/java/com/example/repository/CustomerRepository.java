package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT DISTINCT x FROM Customer x JOIN FETCH x.user ORDER BY x.firstName, x.lastName")
    List<Customer> findAllWithUserOrderByName();

//    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
//    Page<Customer> findAllOrderByName(Pageable pageable);
}
