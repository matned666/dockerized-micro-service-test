package eu.mrndesign.matned.dto;

import eu.mrndesign.matned.model.BaseEntity;

public abstract class BaseDTO {

    protected Long id;

    public BaseDTO() {
    }

    public BaseDTO(BaseEntity applied) {
        if (applied != null) {
            this.id = applied.getId();
        }
    }

    public Long getId() {
        return id;
    }


}
