

public class App {
    public static void main(String[] args) throws Exception {
        
        Competition competition = new Competition("Lima Marathon",50);

        competition.addRunner(new Runner(1,"John Doe", 45));
        competition.addRunner(new Runner(2,"Jane Smith", 48));
        competition.addRunner(new Runner(3,"Bob Johnson", 40));
        competition.addRunner(new Runner(4,"Alice Brown",50));
        competition.addRunner(new Runner(5,"Charlie Davis", 42));
        competition.addRunner(new Runner(6,"Emily Wilson", 47));
        competition.addRunner(new Runner(7,"David Lee", 43));
        competition.addRunner(new Runner(8,"Sarah Miller", 44));
        competition.addRunner(new Runner(9,"Michael Taylor", 41));
        competition.addRunner(new Runner(10,"Jessica Anderson", 46));

        competition.showRunners();

        competition.qualificationTest();

        competition.showQualificationTestResults();

        competition.finalRace();

        competition.showFinalRaceResults();
    }
}
