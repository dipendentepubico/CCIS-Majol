package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fin_mandati_nomi")
public class FinDACMandatiNomiEntity extends AbstractIdEntity{
    @ManyToOne
    @JoinColumn(name="id_mandato", nullable=false, updatable=false)
    private FinDACMandatiEntity mandato;
    @ManyToOne
    @JoinColumn(name="id_an1", nullable=false, updatable=false)
    private An1DACAnagrafeUnicaEntity an1;

    public FinDACMandatiEntity getMandato() {
        return mandato;
    }

    public void setMandato(FinDACMandatiEntity mandato) {
        this.mandato = mandato;
    }

    public An1DACAnagrafeUnicaEntity getAn1() {
        return an1;
    }

    public void setAn1(An1DACAnagrafeUnicaEntity an1) {
        this.an1 = an1;
    }
}
