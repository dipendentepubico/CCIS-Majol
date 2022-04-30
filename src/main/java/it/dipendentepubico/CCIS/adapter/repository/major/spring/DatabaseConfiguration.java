package it.dipendentepubico.CCIS.adapter.repository.major.spring;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "it.dipendentepubico.CCIS.adapter.repository.major.repository")
@EntityScan(basePackages = "it.dipendentepubico.CCIS.adapter.repository.major.entity")
public class DatabaseConfiguration {
}
