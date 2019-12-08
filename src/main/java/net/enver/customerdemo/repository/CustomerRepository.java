package net.enver.customerdemo.repository;

import net.enver.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @author Enver on 08.12.2019 21:09.
 * @project CustomerDemo
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
