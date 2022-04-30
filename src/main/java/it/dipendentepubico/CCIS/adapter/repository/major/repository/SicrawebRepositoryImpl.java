package it.dipendentepubico.CCIS.adapter.repository.major.repository;


import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import it.dipendentepubico.CCIS.usecase.domain.PagingData;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SicrawebRepositoryImpl implements SicrawebRepositoryCustom {

    @PersistenceContext
    protected EntityManager em;


    public List<FinDACMandatiNomiEntity> searchMandati(String theQuery, PagingData pagingData){
        TypedQuery<FinDACMandatiNomiEntity> query = em.createQuery(theQuery, FinDACMandatiNomiEntity.class);
        query.setFirstResult(pagingData.getOffset());
        query.setMaxResults(pagingData.getPageSize());
        List<FinDACMandatiNomiEntity> resultList = query.getResultList();
        return resultList;
    }



    @Override
    public List<FelDACImportFattureEntity> searchFlussi(String queryHQL, PagingData pagingData) {
        TypedQuery<FelDACImportFattureEntity> query = em.createQuery(queryHQL, FelDACImportFattureEntity.class);
        query.setFirstResult(pagingData.getOffset());
        query.setMaxResults(pagingData.getPageSize());
        return query.getResultList();
    }


}
