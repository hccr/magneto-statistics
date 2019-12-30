package cl.hccr.magneto.statistics.controller;

import cl.hccr.magneto.statistics.domain.StatsResponse;
import cl.hccr.magneto.statistics.service.StatsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StatsController {

    private StatsService statsService;

    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("stats")
    public ResponseEntity<StatsResponse> getStats(){
        StatsResponse statsResponse = statsService.getStats();
        if(statsResponse==null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(statsResponse);
    }
}
