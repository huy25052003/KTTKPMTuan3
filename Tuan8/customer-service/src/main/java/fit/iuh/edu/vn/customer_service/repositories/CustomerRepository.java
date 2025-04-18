package fit.iuh.edu.vn.customer_service.repositories;

import fit.iuh.edu.vn.customer_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName, findByAddress, etc.
}
