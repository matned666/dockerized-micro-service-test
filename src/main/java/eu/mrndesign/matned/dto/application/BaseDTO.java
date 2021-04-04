package eu.mrndesign.matned.dto.application;

import eu.mrndesign.matned.model.audit.BaseEntity;

import javax.persistence.Column;
import java.util.Date;

public abstract class BaseDTO {

    protected Long id;

    @Column(name = "create_time")
    protected Date createTime;

    @Column(name = "update_time")
    protected Date updateTime;

    @Column(name = "created_by")
    protected String createdBy;

    @Column(name = "updated_by")
    protected String updatedBy;

    protected Long version;

    public BaseDTO() {
    }

    public BaseDTO(BaseEntity applied) {
        if (applied != null) {
            this.id = applied.getId();
            this.createTime = applied.getCreatedDate();
            this.updateTime = applied.getLastModifiedDate();
            this.createdBy = applied.getCreatedBy();
            this.updatedBy = applied.getLastModifiedBy();
            this.version = applied.getVersion();
        }
    }

    public Long getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getLastModifiedBy() {
        return updatedBy;
    }

    public Long getVersion() {
        return version;
    }

}
