package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AN1_DETTAGLI")
public class An1DACDettagliEntity extends AbstractIdEntity{
    @Column(name = "partita_iva")
    private String partitaIva;

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }
}
