package cl.hccr.magneto.statistics.domain;

public class StatsResponse {

    private int countMutantDna;
    private int  countHumanDna;

    public StatsResponse() {
    }

    public StatsResponse(int countMutantDna, int countHumanDna) {
        this.countMutantDna = countMutantDna;
        this.countHumanDna = countHumanDna;
    }

    public int getCountMutantDna() {
        return countMutantDna;
    }

    public void setCountMutantDna(int countMutantDna) {
        this.countMutantDna = countMutantDna;
    }

    public int getCountHumanDna() {
        return countHumanDna;
    }

    public void setCountHumanDna(int countHumanDna) {
        this.countHumanDna = countHumanDna;
    }

    public double getRatio() {
        if(countHumanDna==0){
            return 0d;
        }
        return (double)countMutantDna/(double)countHumanDna;
    }


}
