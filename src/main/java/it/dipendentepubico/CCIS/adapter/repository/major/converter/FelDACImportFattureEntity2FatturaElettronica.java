package it.dipendentepubico.CCIS.adapter.repository.major.converter;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FelDACImportFattureEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.spring.MapperSpringConfig;
import it.dipendentepubico.CCIS.usecase.domain.FatturaElettronica;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper( config = MapperSpringConfig.class)
public interface FelDACImportFattureEntity2FatturaElettronica extends Converter<FelDACImportFattureEntity, FatturaElettronica> {

    FatturaElettronica convert(FelDACImportFattureEntity s);

}
