package eu.mrndesign.matned.repository;

import eu.mrndesign.matned.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
