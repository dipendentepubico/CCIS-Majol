package it.dipendentepubico.CCIS.adapter.repository.major.exposed;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.model.FatturaEntityList;
import it.dipendentepubico.CCIS.adapter.repository.major.model.FlussoSdiList;
import it.dipendentepubico.CCIS.adapter.repository.major.repository.SicrawebRepository;
import it.dipendentepubico.CCIS.usecase.domain.FlussoSdi;
import it.dipendentepubico.CCIS.usecase.domain.Mandato;
import it.dipendentepubico.CCIS.usecase.domain.PagingData;
import it.dipendentepubico.CCIS.usecase.mapper.Mapper;
import it.dipendentepubico.CCIS.usecase.repository.IAdapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MandatoAdapterRepository implements IAdapterRepository {

    private SicrawebRepository repository;
    private Mapper mapper;

    @Autowired
    public MandatoAdapterRepository(@Qualifier("majolMapper") Mapper mapper, SicrawebRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<Mandato> searchMandati(String theQuery, PagingData pagingData) {
        List<FinDACMandatiNomiEntity> finDACMandatiEntities = repository.searchMandati(theQuery, pagingData);
        return mapper.mapAsList(finDACMandatiEntities, Mandato.class);
    }

    @Override
    public List<FlussoSdi> searchFlussi(String queryHQL, PagingData pagingData) {
        List<FelDACImportFattureEntity> felDACImportFattureEntityList = repository.searchFlussi(queryHQL, pagingData);
        // fattura model con dentro sdi model
        // diventa
        // sdi model con dentro fattura model
        return mapper.map(new FatturaEntityList(felDACImportFattureEntityList), FlussoSdiList.class).getList();
    }




}
