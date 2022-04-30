package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pag_doc_dettaglio")
public class PagDACDocDettaglioEntity extends AbstractIdEntity {
    @ManyToOne
    @JoinColumn(name = "id_doc_testata", insertable = false, updatable = false, nullable = false)
    private PagDACDocTestataEntity docTestata;

    public PagDACDocTestataEntity getDocTestata() {
        return docTestata;
    }

    public void setDocTestata(PagDACDocTestataEntity docTestata) {
        this.docTestata = docTestata;
    }
}
