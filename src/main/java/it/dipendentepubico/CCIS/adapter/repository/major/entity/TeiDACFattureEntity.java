package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEI_FATTURE")
public class TeiDACFattureEntity extends AbstractIdEntity {
    @Column(name = "identificativo_sdi")
    private String identificativoSdi;
    @ManyToOne
    @JoinColumn(name = "id_nominativo")
    private TeiDACNominativiEntity nominativo;

    public String getIdentificativoSdi() {
        return identificativoSdi;
    }

    public void setIdentificativoSdi(String identificativoSdi) {
        this.identificativoSdi = identificativoSdi;
    }

    public TeiDACNominativiEntity getNominativo() {
        return nominativo;
    }

    public void setNominativo(TeiDACNominativiEntity nominativo) {
        this.nominativo = nominativo;
    }
}
