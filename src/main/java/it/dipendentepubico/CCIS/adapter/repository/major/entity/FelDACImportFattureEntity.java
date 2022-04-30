package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "FEL_IMPORT_FATTURE")
public class FelDACImportFattureEntity extends AbstractIdEntity {
    @ManyToOne
    @JoinColumn(name="id_flusso", nullable=false)
    private FelDACImportFlussiEntity flusso;

    @Column(name = "numero", length = 60)
    private String numero;
    @Column(name = "descrizione", length = 200)
    private String descrizione;
    @Column(name = "importo")
    private Double importo;

    public FelDACImportFlussiEntity getFlusso() {
        return flusso;
    }

    public void setFlusso(FelDACImportFlussiEntity flusso) {
        this.flusso = flusso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }
}
