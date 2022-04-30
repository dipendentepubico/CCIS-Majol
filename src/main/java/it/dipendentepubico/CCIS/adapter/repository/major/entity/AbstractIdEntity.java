package it.dipendentepubico.CCIS.adapter.repository.major.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractIdEntity {
    @Id
    @Column(name = "pkid")
    private Long pkId;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }
}
