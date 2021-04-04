package eu.mrndesign.matned.model.application;

import eu.mrndesign.matned.dto.application.CreditDTO;

public interface Editional<DTO> {

    void applyChangesFrom(DTO data);

}
