package Project;

public class UnavailableActivity {
    private int startWeek;
    private int endWeek;
    private String name;

    public UnavailableActivity(String name, int startWeek, int endWeek) {
        this.name = name;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
    }

    public int getStartDate() {
        return startWeek;
    }


    public int getEndDate() {
        return endWeek;
    }

    public String getName() {
        return name;
    }
}
