public class Runner {

    private int id;
    private String name;
    private double recordTime;
    
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
    
}
