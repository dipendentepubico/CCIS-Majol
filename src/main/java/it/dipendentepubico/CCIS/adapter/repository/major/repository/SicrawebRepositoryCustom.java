package it.dipendentepubico.CCIS.adapter.repository.major.repository;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import it.dipendentepubico.CCIS.usecase.domain.PagingData;

import java.util.List;

public interface SicrawebRepositoryCustom {
    List<FinDACMandatiNomiEntity> searchMandati(String theQuery, PagingData pagingData);

    List<FelDACImportFattureEntity> searchFlussi(String queryHQL, PagingData pagingData);
}
