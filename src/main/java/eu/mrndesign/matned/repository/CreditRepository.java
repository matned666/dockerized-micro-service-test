package eu.mrndesign.matned.repository;

import eu.mrndesign.matned.model.application.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
