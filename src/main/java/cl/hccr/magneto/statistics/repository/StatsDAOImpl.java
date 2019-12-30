package cl.hccr.magneto.statistics.repository;

import cl.hccr.magneto.statistics.domain.StatsResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StatsDAOImpl implements StatsDAO {

    private JdbcTemplate jdbcTemplate;

    public StatsDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public StatsResponse getStats() {

        String sql =
                "select " +
                "    sum(case when mutant = 1 then 1 else 0 end) as count_mutant_dna, " +
                "    sum(case when mutant = 0 then 1 else 0 end) as count_human_dna " +
                " from dna;";

        try{
            return
            jdbcTemplate.queryForObject(sql, ( rs,  rowNum)->{
                int mutant = rs.getInt("count_mutant_dna");
                int human = rs.getInt("count_human_dna");
                return new StatsResponse(mutant,human);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;



    }
}
