package it.dipendentepubico.CCIS.adapter.repository.major;

import it.dipendentepubico.CCIS.adapter.repository.major.entity.FinDACMandatiNomiEntity;
import it.dipendentepubico.CCIS.adapter.repository.major.exposed.MandatoAdapterRepositoryTest;
import it.dipendentepubico.CCIS.adapter.repository.major.repository.SicrawebRepository;
import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class JpaTest {
    @Autowired private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private EntityManager entityManager;
    @Autowired
    private SicrawebRepository sicrawebRepository;

    @Autowired
    private MandatoAdapterRepositoryTest repository;

    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource, IsNull.notNullValue());
        assertThat(jdbcTemplate, IsNull.notNullValue());
        assertThat(entityManager, IsNull.notNullValue());
        assertThat(sicrawebRepository, IsNull.notNullValue());
    }

    @Test
    void readonlyRepository(){
        long idMandatoNome = repository.readOnlyTest();
        FinDACMandatiNomiEntity readFromDB = entityManager.find(FinDACMandatiNomiEntity.class, idMandatoNome);
        assertThat(readFromDB, IsNull.nullValue());
    }
}
