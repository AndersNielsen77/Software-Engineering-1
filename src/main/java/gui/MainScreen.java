package gui;

import Project.Employee;
import Project.Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen{
    private Program program;
    private Employee employee;
    private JFrame mainjframe;
    private JPanel contentcenter;
    private JPanel contentsouth;
    private JPanel contentwest;
    private JPanel contenteast;
    public JButton btnCreateProject, bntlogout, btnSetProjectLeader, btnCreateActivity, btnCreateReport, btnAddTimeToActivity, btnEditActivity, btnCreateUnavaliableActivity, btnJoinActivity, btnTotalHoursWorked, btnGetInfo;

    public MainScreen(Program program, Employee employee) {
        this.employee = employee;
        this.program = program;
        initialize();
    }

    public void initialize() {
        //Mainscreen
        mainjframe = new JFrame();
        mainjframe.setTitle("Main Screen");
        mainjframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainjframe.setSize(600, 600);

        mainjframe.getContentPane().setLayout(new BorderLayout());
        contentcenter = new JPanel();
        contentsouth = new JPanel();
        contentwest = new JPanel();
        contentwest.setLayout(new GridLayout(4,0));
        contenteast = new JPanel();
        contenteast.setLayout(new GridLayout(6,0));

        //Console - CENTER
        JTextArea infoOutput = new JTextArea(60, 20);
        JScrollPane scrollPane = new JScrollPane(infoOutput);
        infoOutput.setEditable(false);
        infoOutput.setLineWrap(true);
        contentcenter.add(infoOutput);
        mainjframe.getContentPane().add(contentcenter, BorderLayout.CENTER);

        //PL panel - WEST
        //contentwest.setLayout(new BoxLayout(contentwest, BoxLayout.Y_AXIS));

        //Create Project
        btnCreateProject = new JButton("Create Project");
        btnCreateProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] stringButtons = {"Current Year", "Insert name of project"};
                Popup popup = new Popup(stringButtons, "Create Project", program, infoOutput);
            }
        });

        // Set Project Leader
        btnSetProjectLeader = new JButton("Set Project Leader");
        btnSetProjectLeader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] stringButtons = {"Name of Project", "Initials of Employee"};
                Popup popup = new Popup(stringButtons, "Set Project Leader", program, infoOutput);
                btnCreateActivity.setEnabled(true);
                btnCreateReport.setEnabled(true);
            }
        });

        //Create Activity
        btnCreateActivity = new JButton("Create Activity");
        btnCreateActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Time to finish activity", "Starting date for activity",
                "end date for activity", "Name of activity"};
                Popup popup = new Popup(stringButtons, "Create an activity", program, infoOutput);

            }
        });
        btnCreateReport = new JButton("Create Report");
        btnCreateReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Project name"};
                Popup popup = new Popup(stringButtons,"Create Report",program,infoOutput);
            }
        });

        contentwest.add(btnCreateProject);
        contentwest.add(btnSetProjectLeader);
        contentwest.add(btnCreateActivity);
        contentwest.add(btnCreateReport);

        mainjframe.getContentPane().add(contentwest, BorderLayout.WEST);

        //LogoutSOUTH
        bntlogout = new JButton("Logout");
        bntlogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainjframe.setVisible(false);
                LoginScreen loginScreen = new LoginScreen(program);
            }
        });
        contentsouth.add(bntlogout);

        mainjframe.getContentPane().add(contentsouth, BorderLayout.SOUTH);
        //Employee Panel - EAST
        //contenteast.setLayout(new BoxLayout(contenteast, BoxLayout.Y_AXIS));

        btnAddTimeToActivity = new JButton("Add Time To Activity");
        btnAddTimeToActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Name of activity", "Time to add"};
                Popup popup = new Popup(stringButtons, "Add time to Activity", program, infoOutput);
            }
        });
        btnEditActivity = new JButton("Edit Activity");
        btnEditActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Name of activity", "Updated time"};
                Popup popup = new Popup(stringButtons, "Edit time spent on Activity", program, infoOutput);
            }
        });
        btnCreateUnavaliableActivity = new JButton("Create Unavaliable Activity");
        btnCreateUnavaliableActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Name of activity", "Starting date for activity",
                        "end date for activity"};
                Popup popup = new Popup(stringButtons, "Edit time spent on Activity", program, infoOutput);
            }
        });
        btnJoinActivity = new JButton("Join Activity");
        btnJoinActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Name of activity"};
                Popup popup = new Popup(stringButtons, "Join Activity", program, infoOutput);
            }
        });
        btnTotalHoursWorked = new JButton("Total Hours Worked");
        btnTotalHoursWorked.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        btnGetInfo = new JButton("Get Info");
        btnGetInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Employee"};
                Popup popup = new Popup(stringButtons,"Get Info",program,infoOutput);
            }
        });

        contenteast.add(btnAddTimeToActivity);
        contenteast.add(btnEditActivity);
        contenteast.add(btnCreateUnavaliableActivity);
        contenteast.add(btnJoinActivity);
        contenteast.add(btnTotalHoursWorked);
        contenteast.add(btnGetInfo);

        if(!program.getEmployee(employee).getIsProjectLeader()) {
            btnCreateReport.setEnabled(false);
            btnCreateActivity.setEnabled(false);
        }
        mainjframe.getContentPane().add(contenteast, BorderLayout.EAST);
        mainjframe.setVisible(true);
    }
}

