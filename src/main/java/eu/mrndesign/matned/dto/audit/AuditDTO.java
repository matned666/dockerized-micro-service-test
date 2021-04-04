package eu.mrndesign.matned.dto.audit;

import java.io.Serializable;
import java.util.Objects;

public class AuditDTO implements Serializable {

    private Long id;
    private Long version;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;

    private AuditDTO(AuditBuilder builder){
        this.id = builder.id;
        this.version = builder.version;
        this.createdBy = builder.createdBy;
        this.createdDate = builder.createdDate;
        this.lastModifiedBy = builder.lastModifiedBy;
        this.lastModifiedDate = builder.lastModifiedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditDTO auditDTO = (AuditDTO) o;
        return id.equals(auditDTO.id) &&
                Objects.equals(version, auditDTO.version) &&
                Objects.equals(createdBy, auditDTO.createdBy) &&
                Objects.equals(createdDate, auditDTO.createdDate) &&
                Objects.equals(lastModifiedBy, auditDTO.lastModifiedBy) &&
                Objects.equals(lastModifiedDate, auditDTO.lastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
    }

    @Override
    public String toString() {
        return "AuditDTO{" +
                "id=" + id +
                ", version=" + version +
                ", createdBy=" + createdBy +
                ", createdDate='" + createdDate + '\'' +
                ", lastModifiedById=" + lastModifiedBy +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                '}';
    }

    public static class AuditBuilder{

        private Long id;
        private Long version;
        private String createdBy;
        private String createdDate;
        private String lastModifiedBy;
        private String lastModifiedDate;

        public AuditBuilder() {
        }

        public AuditBuilder version(Long version){
            this.version=version;
            return this;
        }

        public AuditBuilder createdBy(String createdBy){
            this.createdBy =createdBy;
            return this;
        }

        public AuditBuilder createdDate(String createdDate){
            this.createdDate=createdDate;
            return this;
        }

        public AuditBuilder lastModifiedBy(String lastModifiedById){
            this.lastModifiedBy =lastModifiedById;
            return this;
        }

        public AuditBuilder lastModifiedDate(String lastModifiedDate){
            this.lastModifiedDate=lastModifiedDate;
            return this;
        }

        public AuditBuilder id(Long id){
            this.id=id;
            return this;
        }

        public AuditDTO build(){
            return new AuditDTO(this);
        }
    }
}
