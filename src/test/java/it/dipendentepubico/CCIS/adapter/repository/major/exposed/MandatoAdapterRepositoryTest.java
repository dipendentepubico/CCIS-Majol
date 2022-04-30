package it.dipendentepubico.CCIS.adapter.repository.major.exposed;

import it.dipendentepubico.CCIS.adapter.repository.major.repository.SicrawebRepository;
import it.dipendentepubico.CCIS.adapter.repository.major.repository.SicrawebRepositoryTestImpl;
import it.dipendentepubico.CCIS.usecase.mapper.Mapper;
import org.springframework.stereotype.Service;

@Service
public class MandatoAdapterRepositoryTest extends MandatoAdapterRepository{

    private SicrawebRepositoryTestImpl repository;

    public MandatoAdapterRepositoryTest(Mapper mapper, SicrawebRepository repository, SicrawebRepositoryTestImpl repositoryTest){
        super(mapper, repository);
        this.repository = repositoryTest;
    }

    public long readOnlyTest() {
        return repository.readOnlyTest();
    }


}
