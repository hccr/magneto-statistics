package cl.hccr.magneto.statistics.repository;

import cl.hccr.magneto.statistics.domain.StatsResponse;

public interface StatsDAO {
    StatsResponse getStats();
}
