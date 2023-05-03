package OOP.BasicPojo;

import java.util.Map;

public class SportsPojo {

    private Map<String,Integer> hallSports;

    private Map<String,Integer> outdoorsSports;

    public SportsPojo() {

    }

    public Map<String, Integer> getHallSports() {
        return hallSports;
    }

    public void setHallSports(Map<String, Integer> hallSports) {
        this.hallSports = hallSports;
    }

    @Override
    public String toString() {
        return "SportsPojo{" +
                "hallSports=" + hallSports +
                ", outdoorsSports=" + outdoorsSports +
                '}';
    }

    public Map<String, Integer> getOutdoorsSports() {
        return outdoorsSports;
    }

    public void setOutdoorsSports(Map<String, Integer> outdoorsSports) {
        this.outdoorsSports = outdoorsSports;
    }

    public SportsPojo(Map<String, Integer> hallSports, Map<String, Integer> outdoorsSports) {
        this.hallSports = hallSports;
        this.outdoorsSports = outdoorsSports;
    }
}
