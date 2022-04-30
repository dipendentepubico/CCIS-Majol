package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "fin_mandati")
public class FinDACMandatiEntity extends AbstractIdEntity {

    @Column(name = "des")
    private String description;
    @Column(name = "eu")
    private String entrataUscita;
    @Column(name = "cod")
    private Integer codice;
    @Column(name = "anno")
    private Integer anno;
    @Column(name = "data")
    private Date data;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntrataUscita() {
        return entrataUscita;
    }

    public void setEntrataUscita(String entrataUscita) {
        this.entrataUscita = entrataUscita;
    }

    public Integer getCodice() {
        return codice;
    }

    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
