package fit.iuh.edu.vn.order_service.repositories;

import fit.iuh.edu.vn.order_service.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByCustomerId, findByStatus, etc.
}
