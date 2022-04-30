package it.dipendentepubico.CCIS.adapter.repository.major.spring;


import it.dipendentepubico.CCIS.adapter.repository.major.converter.MajolConversionServiceAdapter;
import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = MajolConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceAdapterPackage ="it.dipendentepubico.CCIS.adapter.repository.major.converter",
           conversionServiceAdapterClassName ="MajolConversionServiceAdapter"
)
public interface MapperSpringConfig {
}
