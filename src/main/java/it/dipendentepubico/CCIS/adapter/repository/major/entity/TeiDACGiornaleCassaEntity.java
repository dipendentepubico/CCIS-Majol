package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEI_GIORNALE_CASSA")
public class TeiDACGiornaleCassaEntity extends AbstractIdEntity{
    @Column(name = "esercizio")
    private Integer esercizio;

    public Integer getEsercizio() {
        return esercizio;
    }

    public void setEsercizio(Integer esercizio) {
        this.esercizio = esercizio;
    }
}
