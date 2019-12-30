package cl.hccr.magneto.statistics;


import cl.hccr.magneto.statistics.domain.StatsResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class IntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;




    @Test
    void sendRequest_returnStatistics() {
        //arrange

        //act
        ResponseEntity<StatsResponse> response = restTemplate.getForEntity("/stats", StatsResponse.class);

        //assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(response.getBody().getRatio()).isEqualTo(2.0d);
        Assertions.assertThat(response.getBody().getCountHumanDna()).isEqualTo(1);
        Assertions.assertThat(response.getBody().getCountMutantDna()).isEqualTo(2);

    }

}
