package net.proselyte.customerdemo.model.repository.service.rest;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Customer
 */
public interface CustomerRepository extends JpaRepository <Customer, Long>  {
}
