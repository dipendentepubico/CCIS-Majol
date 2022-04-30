package it.dipendentepubico.CCIS.adapter.repository.major.converter;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.spring.MapperSpringConfig;
import it.dipendentepubico.CCIS.usecase.domain.Mandato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper( config = MapperSpringConfig.class)
public interface FinDACMandatiNomiEntity2Mandato extends Converter<FinDACMandatiNomiEntity, Mandato> {

    @Mapping(source = "mandato.anno", target = "anno")
    @Mapping(source = "mandato.codice", target = "codice")
    Mandato convert(FinDACMandatiNomiEntity s);
}
