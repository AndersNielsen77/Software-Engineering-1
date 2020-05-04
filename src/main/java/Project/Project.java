package Project;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String reportCreated = null;
    private int year;
    private String name;
    private int number;
    private ProjectLeader projectLeader = null;
    private List<Activity> activityList = new ArrayList<>();

    public Project(int year, String name, int number) {
    this.year = year;
    this.name = name;
    this.number = number;
    }

    public ProjectLeader getProjectLeader(){
        return projectLeader;
    }

    public void setProjectLeader(Employee employee) throws Exception {
        if (this.projectLeader == null){
            projectLeader = new ProjectLeader(employee,number);
            employee.setProjectLeader(projectLeader);
        }else{
            throw new Exception("There is already an existing project leader");
        }
    }

    public void createActivity(Employee employee, double time, int startDate, int endDate, String name) throws Exception {
        if (employee == projectLeader.getProjectLeader()){
            Activity activity = new Activity(time,startDate,endDate,name);
            activityList.add(activity);
        }
        else {
            throw new Exception("You are not the project leader");
        }
    }

    public int getYear(){
        return year;
    }

    public String getName() {
        return name;
    }

    public int getNumber(){
        return number;
    }

    public String getReportCreated() {
        return reportCreated;
    }

    public String[] getReport(){
        String[] reportTemp = new String[200];
        int hours = 0;
        int budgetedHours = 0;
        reportCreated = "Report have been created";
        reportTemp[0]="No."+number+" "+name+" Year:"+year;
        reportTemp[1]="........................";
        reportTemp[2]="Project Leader: "+projectLeader.getProjectLeader().getInitials();
        reportTemp[3]="........................";
        reportTemp[4]="Activities";
        reportTemp[5]="---------------------------------";
        int i = 6;
        for (Activity activity : activityList){
            hours += activity.getTimeRegistered();
            budgetedHours += activity.getTime();
            reportTemp[i]=" "+activity.getName();
            i++;
            reportTemp[i]="  -Startweek:"+activity.getStartDate()+" Endweek:"+activity.getEndDate();
            for (Employee employee : activity.getEmployeeList()){
                i++;
                reportTemp[i]="    -"+employee.getInitials()+" Time worked:"+employee.getTimeRegister(activity)+" Hours(s)";
            }
            i++;
            reportTemp[i]=" Time:"+activity.getTimeRegistered()+"/"+activity.getTime()+" Hour(s)";
            i++;
            reportTemp[i]="---------------------------------";
        }
        reportTemp[i+1]="Total Time:"+hours+"/"+budgetedHours+" Hour(s)";
        reportTemp[i+2]="_________________________________";
        String[] report = new String[i+2];
        for (int j = 0; j<i+2;j++){
            report[j]=reportTemp[j];
        }
        return report;
    }

    public Activity getActivity(String name){
        for (Activity activity : activityList){
            if (activity.getName().equals(name)){
                return activity;
            }
        }
        return null;
    }
}
