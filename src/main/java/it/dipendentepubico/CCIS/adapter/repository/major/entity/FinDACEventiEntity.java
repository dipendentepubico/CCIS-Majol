package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "FIN_EVENTI")
public class FinDACEventiEntity extends AbstractIdEntity {
    @ManyToOne
    @JoinColumn(name = "id_doc_dettaglio")
    private PagDACDocDettaglioEntity docDettaglio;
    @Column(name = "tipo", insertable = false, updatable = false)
    private Integer tipo;
    @ManyToOne
    @JoinColumn(name = "id_bilancio", insertable = false, updatable = false)
    private FinDACBilancioEntity bilancio;
    @ManyToOne
    @JoinColumn(name = "id_impegno")
    private FinDACImpegniEntity impegno;
    @ManyToOne
    @JoinColumn(name = "id_mandato_nome")
    private FinDACMandatiNomiEntity mandatoNome;
    @Column(name = "anno_competenza")
    private Integer annoCompetenza;

    public PagDACDocDettaglioEntity getDocDettaglio() {
        return docDettaglio;
    }

    public void setDocDettaglio(PagDACDocDettaglioEntity docDettaglio) {
        this.docDettaglio = docDettaglio;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public FinDACBilancioEntity getBilancio() {
        return bilancio;
    }

    public void setBilancio(FinDACBilancioEntity bilancio) {
        this.bilancio = bilancio;
    }

    public FinDACImpegniEntity getImpegno() {
        return impegno;
    }

    public void setImpegno(FinDACImpegniEntity impegno) {
        this.impegno = impegno;
    }

    public FinDACMandatiNomiEntity getMandatoNome() {
        return mandatoNome;
    }

    public void setMandatoNome(FinDACMandatiNomiEntity mandatoNome) {
        this.mandatoNome = mandatoNome;
    }

    public Integer getAnnoCompetenza() {
        return annoCompetenza;
    }

    public void setAnnoCompetenza(Integer annoCompetenza) {
        this.annoCompetenza = annoCompetenza;
    }
}
