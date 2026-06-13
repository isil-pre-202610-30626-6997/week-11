
import java.util.ArrayList;
import java.util.List;

public class Competition {

    private String name;
    private double classificationTime;
    private List<Runner> runners;

    public Competition(String name, double classificationTime) {
        this.name = name;
        this.classificationTime = classificationTime;
        this.runners = new ArrayList<>();
    }

    public void addRunner(Runner runner) {
        runners.add(runner);
    }

    
}
