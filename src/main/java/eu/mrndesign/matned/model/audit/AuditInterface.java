package eu.mrndesign.matned.model.audit;

import eu.mrndesign.matned.dto.audit.AuditDTO;

import java.util.Date;

public interface AuditInterface {

    Long getId();
    Long getVersion();
    String getCreatedBy();
    String getLastModifiedBy();
    Date getCreatedDate();
    Date getLastModifiedDate();


    static AuditDTO apply(AuditInterface entity){
        return new AuditDTO.AuditBuilder()
                .id(entity.getId())
                .version(entity.getVersion())
                .createdBy(entity.getCreatedBy())
                .createdDate(entity.getCreatedDate() != null ? entity.getCreatedDate().toString() : null)
                .lastModifiedBy(entity.getLastModifiedBy())
                .lastModifiedDate(entity.getLastModifiedDate() != null ? entity.getLastModifiedDate().toString() : null)
                .build();
    }

}

