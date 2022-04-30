package it.dipendentepubico.CCIS.adapter.repository.major.spring;


import it.dipendentepubico.CCIS.usecase.mapper.MapperImpl;
import it.dipendentepubico.CCIS.usecase.mapper.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;

@Configuration("majolMapperConfiguration")
public class MapperConfiguration {

    @Bean(name = "majolMapper")
    public Mapper mapper(@Qualifier("majolConversionService") ConversionService conversionService){
        MapperImpl mapperImpl = new MapperImpl(conversionService);
        return mapperImpl;
    }
}
