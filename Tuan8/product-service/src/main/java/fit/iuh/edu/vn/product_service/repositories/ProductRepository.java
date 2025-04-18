package fit.iuh.edu.vn.product_service.repositories;

import fit.iuh.edu.vn.product_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName, findByPriceBetween, etc.

}
