package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "FEL_IMPORT_DETTAGLI")
public class FelDACImportDettagliEntity extends AbstractIdEntity {

    @ManyToOne
    @JoinColumn(name="id_fattura", nullable=false)
    private FelDACImportFattureEntity fattura;
    @Column(name = "natura_aliquota", length = 2)
    private String naturaAliquota;

    public FelDACImportFattureEntity getFattura() {
        return fattura;
    }

    public void setFattura(FelDACImportFattureEntity fattura) {
        this.fattura = fattura;
    }

    public String getNaturaAliquota() {
        return naturaAliquota;
    }

    public void setNaturaAliquota(String naturaAliquota) {
        this.naturaAliquota = naturaAliquota;
    }
}
