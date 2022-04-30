package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FIN_BILANCIO")
public class FinDACBilancioEntity extends AbstractIdEntity{
    @Column(name = "id_titolo_dpr118", insertable = false, updatable = false)
    private Long idTitoloDPR118;

    public Long getIdTitoloDPR118() {
        return idTitoloDPR118;
    }

    public void setIdTitoloDPR118(Long idTitoloDPR118) {
        this.idTitoloDPR118 = idTitoloDPR118;
    }
}
