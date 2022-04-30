package it.dipendentepubico.CCIS.adapter.repository.major.repository;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SicrawebRepository extends JpaRepository<FinDACMandatiEntity,Integer>, SicrawebRepositoryCustom {
}
