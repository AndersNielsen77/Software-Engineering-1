package Project;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String initials;
    private ProjectLeader projectLeader = null;
    private List<TimeRegister> timeregistered = new ArrayList<>();
    private List<UnavailableActivity> unavailableList = new ArrayList<>();

    public Employee(String initials) {
        this.initials = initials;
    }

    public void createUnavailablety(String name, int startWeek, int endWeek){
        UnavailableActivity activity = new UnavailableActivity(name, startWeek, endWeek);
        unavailableList.add(activity);
    }

    public boolean isAvailable(int startWeek, int endWeek){
        if (unavailableList.size() > 0) {
            for (UnavailableActivity isAvailable : unavailableList) {
                if (isAvailable.getStartDate() > endWeek || isAvailable.getEndDate() < startWeek) {
                    return true;
                }
            }
            return false;
        }else return true;
    }

    public List<UnavailableActivity> getUnavailableList() {
        return unavailableList;
    }

    public void setProjectLeader(ProjectLeader projectLeader) {
    this.projectLeader = projectLeader;
    }

    public Boolean getIsProjectLeader() {
    return !(projectLeader == null);
    }

    public void addToActivities(Activity activity2){
        TimeRegister newTimeRegister  = new TimeRegister(activity2,0);
        this.timeregistered.add(newTimeRegister);
    }

    public void editTimeOnActivity(Activity activity, double time){
        for (TimeRegister activity1 : timeregistered){
            if (activity1.getActivity().equals(activity)){
                activity.registerTime(-activity1.getTime());
                activity1.setTime(time);
                activity.registerTime(activity1.getTime());
            }
        }
    }

    public void addTimeToActivity(Activity activity, double time){
        for (TimeRegister activity1 : timeregistered){
            if (activity1.getActivity().equals(activity)){
                activity1.addTime(time);
                activity.registerTime(time);
            }
        }
    }

    public double getTimeRegister(Activity activity) {
        for (TimeRegister activity1 : timeregistered){
            if (activity1.getActivity().equals(activity)){
                return activity1.getTime();
            }
        }
        return -1;
    }

    public double getTotalTime() {
        double total = 0;
        for (TimeRegister activity1 : timeregistered){
            total += activity1.getTime();
        }
        return total;
    }

    public String getInitials() {
        return initials;
    }

    public List<TimeRegister> getTimeregisteredList() {
        return timeregistered;
    }
}
