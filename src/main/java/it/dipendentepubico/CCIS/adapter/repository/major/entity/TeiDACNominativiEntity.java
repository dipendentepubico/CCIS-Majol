package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEI_NOMINATIVI")
public class TeiDACNominativiEntity extends AbstractIdEntity {

    @ManyToOne
    @JoinColumn(name = "id_ordinativo")
    private TeiDACOrdinativiEntity ordinativo;

    public TeiDACOrdinativiEntity getOrdinativo() {
        return ordinativo;
    }

    public void setOrdinativo(TeiDACOrdinativiEntity ordinativo) {
        this.ordinativo = ordinativo;
    }
}
