package Project;

public class TimeRegister {
    private Activity activity;
    private double time;

    public TimeRegister(Activity activity, double time) {
    this.activity = activity;
    this.time = time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void addTime(double time) {
        this.time += time;
    }

    public Activity getActivity() {
        return activity;
    }

    public double getTime() {
        return time;
    }
}
