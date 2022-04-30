package it.dipendentepubico.CCIS.adapter.repository.major.repository;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.An1DACAnagrafeUnicaEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.An1DACDettagliEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SicrawebRepositoryTestImpl extends SicrawebRepositoryImpl{


    public long readOnlyTest(){

        FinDACMandatiNomiEntity testSalva = new FinDACMandatiNomiEntity();
        FinDACMandatiEntity mandato = new FinDACMandatiEntity();
        mandato.setAnno(2019);
        mandato.setCodice(888);
        mandato.setPkId(555L);
        em.persist(mandato);
        testSalva.setMandato(mandato);
        An1DACAnagrafeUnicaEntity an1 = new An1DACAnagrafeUnicaEntity();
        an1.setCodiceFiscale("CF");
        an1.setPkId(444L);
        An1DACDettagliEntity dettagli = new An1DACDettagliEntity();
        dettagli.setPartitaIva("testpiva");
        dettagli.setPkId(333L);
        em.persist(dettagli);
        an1.setDettagli(dettagli);
        em.persist(an1);
        testSalva.setAn1(an1);
        long idMandatoNome = 666L;
        testSalva.setPkId(idMandatoNome);
        em.persist(testSalva);

        return idMandatoNome;
    }

}
