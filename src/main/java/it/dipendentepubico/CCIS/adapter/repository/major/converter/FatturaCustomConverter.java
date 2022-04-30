package it.dipendentepubico.CCIS.adapter.repository.major.converter;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.model.FatturaEntityList;
import it.dipendentepubico.CCIS.adapter.repository.major.model.FlussoSdiList;
import it.dipendentepubico.CCIS.adapter.repository.major.spring.MapperSpringConfig;
import it.dipendentepubico.CCIS.usecase.domain.FlussoSdi;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper( config = MapperSpringConfig.class)
public abstract class FatturaCustomConverter implements Converter<FatturaEntityList, FlussoSdiList> {
    @Autowired
    private FelDACImportFattureEntity2FatturaElettronica fmap;

    public FlussoSdiList convert(FatturaEntityList source) {
        Map<Long, FlussoSdi> map = new HashMap<>();
        for(FelDACImportFattureEntity f : source.getList()){
            FlussoSdi flussoSdi;
            if(map.containsKey(f.getFlusso().getIdentificativoSdi())){
                flussoSdi = map.get(f.getFlusso().getIdentificativoSdi());
            }else{
                flussoSdi = new FlussoSdi();
                flussoSdi.setFatturaElettronicaList(new ArrayList<>());
                flussoSdi.setIdentificativoSdi(BigInteger.valueOf(f.getFlusso().getIdentificativoSdi()));
                map.put(f.getFlusso().getIdentificativoSdi(), flussoSdi);
            }
            flussoSdi.getFatturaElettronicaList().add(fmap.convert(f));
        }
        return new FlussoSdiList( map.values().stream().collect(Collectors.toList()) );
    }


}
