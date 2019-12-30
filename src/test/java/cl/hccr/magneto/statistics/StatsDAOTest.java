package cl.hccr.magneto.statistics;

import cl.hccr.magneto.statistics.domain.StatsResponse;
import cl.hccr.magneto.statistics.repository.StatsDAO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class StatsDAOTest {
    @Autowired
    private StatsDAO statsDAO;

    @Test
    void getStats(){
        StatsResponse response = statsDAO.getStats();

        Assertions.assertThat(response).isNotNull();
        Assertions.assertThat(response.getCountMutantDna()).isEqualTo(2);
        Assertions.assertThat(response.getCountHumanDna()).isEqualTo(1);
        Assertions.assertThat(response.getRatio()).isEqualTo(2.0d);
    }
}
