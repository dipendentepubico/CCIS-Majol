package it.dipendentepubico.CCIS.adapter.repository.major.converter;

import it.dipendentepubico.CCIS.adapter.repository.major.spring.MapperSpringConfig;
import it.dipendentepubico.CCIS.domain.model.FlussoSdiType;
import it.dipendentepubico.CCIS.usecase.domain.FlussoSdi;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper( config = MapperSpringConfig.class)
public interface FlussoSdi2FlussoSdiType extends Converter<FlussoSdi, FlussoSdiType> {
    @Mapping(source = "identificativoSdi", target = "identificativoSdi.value" )
    FlussoSdiType convert(FlussoSdi s);
}
