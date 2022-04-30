package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FEL_IMPORT_FLUSSI")
public class FelDACImportFlussiEntity extends AbstractIdEntity {
    @Column(name = "identificativo_sdi")
    private Long identificativoSdi;

    public Long getIdentificativoSdi() {
        return identificativoSdi;
    }

    public void setIdentificativoSdi(Long identificativoSdi) {
        this.identificativoSdi = identificativoSdi;
    }
}
