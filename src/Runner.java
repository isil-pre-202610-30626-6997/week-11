
public class Runner {

    private int id;
    private String name;
    private double recordTime;
    private double qualificationTime;
    private double raceTime;

    public Runner(int id, String name, double recordTime) {
        this.id = id;
        this.name = name;
        this.recordTime = recordTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    public double getQualificationTime() {
        return qualificationTime;
    }

    public void setQualificationTime(double qualificationTime) {
        this.qualificationTime = qualificationTime;
    }

    public double getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(double raceTime) {
        this.raceTime = raceTime;
    }

    @Override
    public String toString() {
        return "Name: " + name + " - Personal record: " + String.format("%.2f", recordTime);
    }

}
