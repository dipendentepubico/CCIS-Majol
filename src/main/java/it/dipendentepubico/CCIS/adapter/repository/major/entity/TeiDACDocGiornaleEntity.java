package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEI_DOC_GIORNALE")
public class TeiDACDocGiornaleEntity extends AbstractIdEntity{

    @ManyToOne
    @JoinColumn(name = "id_giornale")
    private TeiDACGiornaleCassaEntity giornaleCassa;
    @Column(name = "numero_documento")
    private Integer numeroDocumento;
    @Column(name = "eu")
    private String eu;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "tipo_operazione")
    private String tipoOperazione;

    public TeiDACGiornaleCassaEntity getGiornaleCassa() {
        return giornaleCassa;
    }

    public void setGiornaleCassa(TeiDACGiornaleCassaEntity giornaleCassa) {
        this.giornaleCassa = giornaleCassa;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEu() {
        return eu;
    }

    public void setEu(String eu) {
        this.eu = eu;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoOperazione() {
        return tipoOperazione;
    }

    public void setTipoOperazione(String tipoOperazione) {
        this.tipoOperazione = tipoOperazione;
    }
}
