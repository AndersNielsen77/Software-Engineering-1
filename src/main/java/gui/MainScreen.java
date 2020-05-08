// Mads Ptak s194297
package gui;

import Project.Employee;
import Project.Program;
import Project.TimeRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen{
    private Program program;
    private Employee employee;
    private JFrame mainjframe;
    private JPanel contentCenter;
    private JPanel contentWest2;
    private JPanel contentWest;
    private JPanel contentEast;
    private JPanel contentEast2;
    public JButton btnCreateProject, bntlogout, btnSetProjectLeader, btnCreateActivity, btnCreateReport, btnAddTimeToActivity, btnEditActivity, btnCreateUnavaliableActivity, btnJoinActivity, btnTotalHoursWorked, btnGetInfo;

    public MainScreen(Program program, Employee employee) {
        this.employee = employee;
        this.program = program;
        initialize();
    }

    public void initialize() {
        //Mainscreen
        mainjframe = new JFrame();
        mainjframe.setTitle("Main Screen: "+employee.getInitials());
        mainjframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content,BoxLayout.X_AXIS));

        contentCenter = new JPanel();
        contentWest2 = new JPanel();
        contentWest2.setLayout(new GridLayout(0,1,40,40));
        contentEast2 = new JPanel();
        contentEast2.setLayout(new GridLayout(0,1,40,40));
        contentWest = new JPanel();
        contentWest.setLayout(new GridLayout(5,0,10,40));
        contentWest.setMaximumSize(new Dimension(100,390));
        contentEast = new JPanel();
        contentEast.setLayout(new GridLayout(5,0,10,40));
        contentEast.setMaximumSize(new Dimension(100,390));


        //Console - CENTER
        JTextArea infoOutput = new JTextArea(60, 40);
        JScrollPane scrollPane = new JScrollPane(infoOutput);
        infoOutput.setEditable(false);
        infoOutput.setLineWrap(true);
        contentCenter.add(infoOutput);
        mainjframe.getContentPane().add(contentCenter, BorderLayout.CENTER);

        //PL panel - WEST
        //contentwest.setLayout(new BoxLayout(contentwest, BoxLayout.Y_AXIS));

        //Create Project
        btnCreateProject = new JButton("Create Project");
        btnCreateProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] stringButtons = {"Current Year", "Insert name of project"};
                Popup popup = new Popup(stringButtons, "Create Project", program, infoOutput, employee);
            }
        });

        // Set Project Leader
        btnSetProjectLeader = new JButton("Set Project Leader");
        btnSetProjectLeader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String[] stringButtons = {"Name of Project", "Initials of Employee"};
                btnCreateActivity.setEnabled(false);
                btnCreateReport.setEnabled(false);
                Popup popup = new Popup(stringButtons, "Set Project Leader", program, infoOutput, employee);
            }
        });

        //Create Activity
        btnCreateActivity = new JButton("Create Activity");
        btnCreateActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Time to finish activity", "Starting date for activity",
                "end date for activity", "Name of activity"};
                Popup popup = new Popup(stringButtons, "Create an activity", program, infoOutput, employee);

            }
        });
        btnCreateReport = new JButton("Create Report");
        btnCreateReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Project name"};
                Popup popup = new Popup(stringButtons,"Create Report",program,infoOutput, employee);
            }
        });

        contentWest.add(btnCreateProject);
        contentWest.add(btnSetProjectLeader);
        contentWest.add(btnCreateActivity);
        contentWest.add(btnCreateReport);

        mainjframe.getContentPane().add(contentWest, BorderLayout.WEST);

        //LogoutSOUTH
        bntlogout = new JButton("Logout");
        bntlogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainjframe.setVisible(false);
                LoginScreen loginScreen = new LoginScreen(program);
            }
        });
        contentWest.add(bntlogout);

        mainjframe.getContentPane().add(contentCenter, BorderLayout.SOUTH);
        //Employee Panel - EAST
        //contenteast.setLayout(new BoxLayout(contenteast, BoxLayout.Y_AXIS));

        btnAddTimeToActivity = new JButton("Add Time To Activity");
        btnAddTimeToActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Project name", "Name of activity", "Time to add"};
                Popup popup = new Popup(stringButtons, "Add time to Activity", program, infoOutput, employee);
            }
        });
        btnEditActivity = new JButton("Edit Activity");
        btnEditActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Project name", "Name of activity", "Updated time"};
                Popup popup = new Popup(stringButtons, "Edit time spent on Activity", program, infoOutput, employee);
            }
        });
        btnCreateUnavaliableActivity = new JButton("Create Unavaliable Activity");
        btnCreateUnavaliableActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Name of activity", "Starting date for activity",
                        "end date for activity"};
                Popup popup = new Popup(stringButtons, "Create Unavailable Activity", program, infoOutput, employee);
            }
        });
        btnJoinActivity = new JButton("Join Activity");
        btnJoinActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] stringButtons = {"Initials of Employee", "Project name", "Name of activity"};
                Popup popup = new Popup(stringButtons, "Join Activity", program, infoOutput, employee);
            }
        });
        btnGetInfo = new JButton("Get Info");
        btnGetInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                 JFrame reportFrame = new JFrame(employee.getInitials()+" Info");
                JTextArea reportArea = new JTextArea();
                JPanel contentcenter = new JPanel();
                contentcenter.add(reportArea);
                reportFrame.setSize(600, 600);
                reportFrame.getContentPane().add(contentcenter, BorderLayout.CENTER);
                reportFrame.setLocationRelativeTo(null);
                reportFrame.setVisible(true);

                reportArea.append("Employee: "+program.getEmployee(employee.getInitials()).getInitials()+"\n");
                reportArea.append("hours on Activities;"+"\n");
                for (TimeRegister timer : program.getEmployee(employee.getInitials()).getTimeregisteredList()){
                    reportArea.append(timer.getActivity().getName()+": "+timer.getTime()+"Hours"+"\n");
                }
                reportArea.append("Total time worked: "+program.getEmployee(employee.getInitials()).getTotalTime()+"Hours");

            }
        });

        contentEast.add(btnAddTimeToActivity);
        contentEast.add(btnEditActivity);
        contentEast.add(btnCreateUnavaliableActivity);
        contentEast.add(btnJoinActivity);
        contentEast.add(btnGetInfo);

        if(!program.getEmployee(employee.getInitials()).getIsProjectLeader()) {
            btnCreateReport.setEnabled(false);
            btnCreateActivity.setEnabled(false);
        }
        //mainjframe.getContentPane().add(contenteast, BorderLayout.EAST);

        content.add(contentWest2);
        content.add(contentWest);
        content.add(contentCenter);
        content.add(contentEast);
        content.add(contentEast2);
        mainjframe.setContentPane(content);

        mainjframe.setSize(800,440);
        mainjframe.setResizable(false);
        mainjframe.setLocationRelativeTo(null);
        mainjframe.setVisible(true);
    }
}

