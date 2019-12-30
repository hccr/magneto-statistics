package cl.hccr.magneto.statistics.service;

import cl.hccr.magneto.statistics.domain.StatsResponse;
import cl.hccr.magneto.statistics.repository.StatsDAO;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {

    private StatsDAO statsDAO;

    public StatsServiceImpl(StatsDAO statsDAO) {
        this.statsDAO = statsDAO;
    }

    @Override
    public StatsResponse getStats() {

        return statsDAO.getStats();
    }
}
