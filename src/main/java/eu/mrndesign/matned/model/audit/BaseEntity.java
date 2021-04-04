package eu.mrndesign.matned.model.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity implements AuditInterface{

    @Id
    @GeneratedValue
    @Nullable
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @CreatedBy
    @Column(name = "made_by")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String lastModifiedBy;

    @Version
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    @Nullable
    public Long getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createTime;
    }

    public Date getLastModifiedDate() {
        return updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime) && Objects.equals(createdBy, that.createdBy) && Objects.equals(lastModifiedBy, that.lastModifiedBy) && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, updateTime, createdBy, lastModifiedBy, version);
    }
}
