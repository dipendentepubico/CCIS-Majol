package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PAG_DOC_TESTATA")
public class PagDACDocTestataEntity extends AbstractIdEntity {
    @Column(name = "identificativo_sdi")
    private Long identificativoSdi;

    @Column(name = "anno")
    private Long anno;
    @Column(name = "data_doc")
    private Date data;
    @Column(name = "codice_doc")
    private String numero;
    @Column(name = "tot_emesso")
    private Double importoTotale;

    public Long getIdentificativoSdi() {
        return identificativoSdi;
    }

    public void setIdentificativoSdi(Long identificativoSdi) {
        this.identificativoSdi = identificativoSdi;
    }

    public Long getAnno() {
        return anno;
    }

    public void setAnno(Long anno) {
        this.anno = anno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getImportoTotale() {
        return importoTotale;
    }

    public void setImportoTotale(Double importoTotale) {
        this.importoTotale = importoTotale;
    }
}
