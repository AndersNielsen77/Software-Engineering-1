package gui;

import Project.Activity;
import Project.Program;
import Project.TimeRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup extends JFrame {
            private Program program;
            private JTextArea infoOutput;
    public Popup(String[] buttons,String title, Program program,JTextArea infoOutput) {
        this.infoOutput = infoOutput;
        this.program = program;
        JLabel[] labelList = new JLabel[buttons.length];
        TextField[] textFields = new TextField[buttons.length];

        setTitle(title);
        getContentPane().setLayout(new BorderLayout());
        setSize(300, 300);
        JPanel contentCenter = new JPanel();
        JPanel contentSouth = new JPanel();

        contentCenter.setLayout(new GridLayout(buttons.length*2,0));
        
        for (int i = 0; i < buttons.length;i++){
            labelList[i] = new JLabel(buttons[i]);
            textFields[i] = new TextField();
            contentCenter.add(labelList[i]);
            contentCenter.add(textFields[i]);
        }

        JButton ok = new JButton("Ok");
        ActionsListeners(title,textFields,ok);

        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        contentSouth.setLayout(new GridLayout(0,2));
        contentSouth.add(ok);
        contentSouth.add(cancel);

        getContentPane().add(contentCenter, BorderLayout.CENTER);
        getContentPane().add(contentSouth, BorderLayout.SOUTH);
        setVisible(true);

    }

    public void ActionsListeners(String title,TextField[] textField,JButton ok){

        if (title.equals("Create Project")) {
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    int years = Integer.parseInt(info[0]);
                    program.addProject(years, info[1]);
                    infoOutput.append("Project Created with name: " + program.getProject(info[1]).getName() + "\n");
                    dispose();
                }
            });
        }else if(title.equals("Set Project Leader")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    try {
                        if(program.getProject(info[0]).getProjectLeader() == null) {
                            program.getProject(info[0]).setProjectLeader(program.getEmployee(info[1]));
                            infoOutput.append("A Project Leader has been set for project: "+info[0] +"\n");
                        }
                    } catch (Exception ex) {
                        infoOutput.append(""+ex+"\n");
                    }
                    dispose();
                }
            });
        }else if(title.equals("Create an activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    double time = Double.parseDouble(info[2]);
                    int startdate = Integer.parseInt(info[3]);
                    int enddate = Integer.parseInt(info[4]);

                    try {
                        program.getProject(info[1]).createActivity(program.getEmployee(info[0]),time,startdate,enddate,info[5]);
                        program.getProject(info[1]).getActivity(info[5]).addEmployee(program.getEmployee(info[0]));
                        infoOutput.append("Activity "+ info[5] +" has been created with attached employee: "+program.getEmployee(info[0]).getInitials()+"\n");
                    } catch (Exception ex) {
                        infoOutput.append(""+ex+"\n");
                    }
                    dispose();
                }
            });
        }else if(title.equals("Create Report")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    String[] report = program.getProject(info[0]).getReport();

                    JFrame reportFrame = new JFrame(info[0]+" Report");
                    JTextArea reportArea = new JTextArea();
                    JPanel contentcenter = new JPanel();
                    contentcenter.add(reportArea);
                    reportFrame.setSize(600, 600);
                    reportFrame.getContentPane().add(contentcenter, BorderLayout.CENTER);

                    for (String s : report) {
                        reportArea.append(s + "\n");
                    }
                    reportFrame.setVisible(true);
                    dispose();
                }
            });
        }else if(title.equals("Add time to Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    Double time = Double.parseDouble(info[3]);
                    program.getEmployee(info[0]).addTimeToActivity(program.getProject(info[1]).getActivity(info[2]),time);
                    infoOutput.append(program.getEmployee(info[0]).getTimeRegister(program.getProject(info[1]).getActivity(info[2])) +" hour(s) have been added to the activity");
                    dispose();
                }
            });
        }else if(title.equals("Edit time spent on Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    Double time = Double.parseDouble(info[3]);
                    program.getEmployee(info[0]).editTimeOnActivity(program.getProject(info[1]).getActivity(info[3]),time);
                    dispose();
                }
            });
        }else if(title.equals("Create Unavailable Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    int startweek = Integer.parseInt(info[2]);
                    int endweek = Integer.parseInt(info[3]);
                    program.getEmployee(info[0]).createUnavailablety(info[1],startweek,endweek);
                }
            });
        }else if(title.equals("Join Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    try {
                        program.getProject(info[1]).getActivity(info[2]).addEmployee(program.getEmployee(info[0]));
                    } catch (Exception ex) {
                        infoOutput.append(""+ex+"\n");
                    }
                }
            });
        }else if(title.equals("Total Hours Worked")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                }
            });
        }else if(title.equals("Get Info")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);

                    JFrame reportFrame = new JFrame(info[0]+" Info");
                    JTextArea reportArea = new JTextArea();
                    JPanel contentcenter = new JPanel();
                    contentcenter.add(reportArea);
                    reportFrame.setSize(600, 600);
                    reportFrame.getContentPane().add(contentcenter, BorderLayout.CENTER);
                    reportFrame.setVisible(true);

                    reportArea.append("Employee: "+program.getEmployee(info[0]).getInitials()+"\n");
                    reportArea.append("hours on Activities;"+"\n");
                    for (TimeRegister timer : program.getEmployee(info[0]).getTimeregisteredList()){
                        reportArea.append(timer.getActivity().getName()+": "+timer.getTime()+"Hours"+"\n");
                    }
                    reportArea.append("Total time worked: "+program.getEmployee(info[0]).getTotalTime()+"Hours");
                    dispose();
                }
            });
        }else {
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    dispose();
                }
            });
        }
    }

    public String[] getTextFromTextField(TextField[] textField){
        String[] info = new String[textField.length];
        for (int i = 0; i < textField.length; i++) {
            info[i] = textField[i].getText();
        }
        return info;
    }
}