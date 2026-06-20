
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Competition {

    private final String name;
    private final double qualificationTime;
    private final List<Runner> runners;
    private final List<Runner> qualifiedRunners;

    public Competition(String name, double qualificationTime) {
        this.name = name;
        this.qualificationTime = qualificationTime;
        this.runners = new ArrayList<>();
        this.qualifiedRunners = new ArrayList<>();
    }

    public void addRunner(Runner runner) {
        runners.add(runner);
    }

    public void showRunners() {

        System.out.println("===================");
        System.out.println(name);

        System.out.println("Runners");
        System.out.println("===================");

        for (Runner runner : runners) {
            System.out.println(runner);
        }
        System.err.println("");

    }

    public void qualificationTest() {
        /*
            Límite inferior: qualificationTime - 10
            Límite superior: qualificationTime + 10
         */
        for (Runner runner : runners) {
            double record = Math.random() * 20 + qualificationTime - 10;
            runner.setQualificationTime(record);

            if (record <= qualificationTime) {
                qualifiedRunners.add(runner);
            }
        }

    }

    public void showQualificationTestResults() {
        System.out.println("===================");
        System.out.println(name);
        System.out.println("Qualified runners");
        System.out.println("Time: " + qualificationTime);

        System.out.println("===================");

        for (Runner runner : qualifiedRunners) {
            System.out.println(runner + " - Qualification time: " + String.format("%.2f", runner.getQualificationTime()));
        }
        System.err.println("");
    }

    public void finalRace() {
        /*
            Límite inferior: qualificationTime - 10
            Límite superior: qualificationTime + 10
         */
        for (Runner runner : qualifiedRunners) {
            double record = Math.random() * 20 + qualificationTime - 10;
            runner.setRaceTime(record);

            if (record < runner.getRecordTime()) {
                runner.setRecordTime(record);
            }
        }

        qualifiedRunners.sort(Comparator.comparing(Runner::getRaceTime));

    }

    public void showFinalRaceResults() {
        System.out.println("===================");
        System.out.println(name);
        System.out.println("Final results");
        System.out.println("===================");

        for (Runner runner : qualifiedRunners) {
            System.out.println(runner + " - Race time: " + String.format("%.2f", runner.getRaceTime()));
        }
        System.err.println("");
    }

}
