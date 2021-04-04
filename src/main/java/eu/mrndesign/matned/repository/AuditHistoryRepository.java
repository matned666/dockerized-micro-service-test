package eu.mrndesign.matned.repository;

import eu.mrndesign.matned.model.audit.AuditHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditHistoryRepository extends JpaRepository<AuditHistory, Long> {
}
