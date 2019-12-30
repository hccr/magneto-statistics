package cl.hccr.magneto.statistics;


import cl.hccr.magneto.statistics.domain.StatsResponse;
import cl.hccr.magneto.statistics.repository.StatsDAO;
import cl.hccr.magneto.statistics.service.StatsService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class StatsServiceTest {

    @MockBean
    private StatsDAO statsDAO;

    @Autowired
    private StatsService statsService;


    @Test
    void getStats(){
        given(statsDAO.getStats()).willReturn(new StatsResponse(40,100));

        Assertions.assertThat(statsService.getStats().getRatio()).isEqualTo(0.4d);
        Assertions.assertThat(statsService.getStats().getCountHumanDna()).isEqualTo(100);
        Assertions.assertThat(statsService.getStats().getCountMutantDna()).isEqualTo(40);

    }

}
