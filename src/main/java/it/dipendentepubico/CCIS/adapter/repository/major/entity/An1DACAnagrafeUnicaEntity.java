package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "AN1_ANAGRAFE_UNICA")
public class An1DACAnagrafeUnicaEntity extends AbstractIdEntity{
    @Column(name = "codice_fiscale")
    private String codiceFiscale;
    @OneToOne
    @JoinColumn(name="id_dettagli", unique=true, nullable=false, updatable=false)
    private An1DACDettagliEntity dettagli;


    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public An1DACDettagliEntity getDettagli() {
        return dettagli;
    }

    public void setDettagli(An1DACDettagliEntity dettagli) {
        this.dettagli = dettagli;
    }
}
