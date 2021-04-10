package eu.mrndesign.matned.repository;

import eu.mrndesign.matned.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    @Query("select c from ClientEntity c where c.credit = ?1")
    Optional<ClientEntity> findClientByCreditId(Long creditId);

}
