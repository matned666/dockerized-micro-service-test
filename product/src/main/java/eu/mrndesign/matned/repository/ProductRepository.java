package eu.mrndesign.matned.repository;

import eu.mrndesign.matned.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.credit = ?1")
    Optional<Product> findProductByCreditId(Long creditId);
}
