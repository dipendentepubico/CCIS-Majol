package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEI_ORDINATIVI")
public class TeiDACOrdinativiEntity extends AbstractIdEntity {

    private String eu;

    private Integer numero;

    public String getEu() {
        return eu;
    }

    public void setEu(String eu) {
        this.eu = eu;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
