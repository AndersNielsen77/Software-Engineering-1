package gui;

import Project.Employee;
import Project.Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup extends JFrame {
            private Program program;
            private JTextArea infoOutput;
            private Employee employee;
    public Popup(String[] buttons,String title, Program program,JTextArea infoOutput, Employee employee) {
        this.employee = employee;
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
                    if (info[0].matches("\\d+") && info[0].length() == 4) {
                        int years = Integer.parseInt(info[0]);
                        program.addProject(years, info[1]);
                        infoOutput.append("Project Created with name: " + program.getProject(info[1]).getName() + "\n");
                        dispose();
                    }else{ok.setText("Wrong input in year");}
                }
            });
        }else if(title.equals("Set Project Leader")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    try {
                        if (program.getProject(info[0]) != null){
                            if(program.getProject(info[0]).getProjectLeader() == null) {
                            program.getProject(info[0]).setProjectLeader(program.getEmployee(info[1]));
                            infoOutput.append("A Project Leader has been set for project: "+info[0] +"\n");
                            }
                        }else{ok.setText("Project does not exist");}
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

                    if (program.getProject(info[1]) != null) {
                        try {
                            program.getProject(info[1]).createActivity(program.getEmployee(employee), time, startdate, enddate, info[5]);
                            program.getProject(info[1]).getActivity(info[5]).addEmployee(program.getEmployee(info[0]));
                            infoOutput.append("Activity "+ info[5] +" has been created with attached employee: "+program.getEmployee(info[0]).getInitials()+"\n");

                        } catch (Exception ex) {
                            infoOutput.append(""+ex+"\n");
                        }
                    dispose();
                    }else{ok.setText("Project does not exist");}
                }
            });
        }else if(title.equals("Create Report")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    if (program.getProject(info[0]) != null) {
                        String[] report = program.getProject(info[0]).getReport();

                        JFrame reportFrame = new JFrame(info[0] + " Report");
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
                    }else {ok.setText("Project does not exist");}
                }
            });
        }else if(title.equals("Add time to Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    Double time = Double.parseDouble(info[2]);
                    if (program.getProject(info[0]) != null) {
                        program.getEmployee(employee).addTimeToActivity(program.getProject(info[0]).getActivity(info[1]), time);
                        infoOutput.append(program.getEmployee(employee).getTimeRegister(program.getProject(info[0]).getActivity(info[1])) + " hour(s) have been added to the activity");
                        dispose();
                    }else {ok.setText("Project does not exist");}
                }
            });
        }else if(title.equals("Edit time spent on Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    Double time = Double.parseDouble(info[2]);
                    if (program.getProject(info[0]) != null) {
                        program.getEmployee(employee).editTimeOnActivity(program.getProject(info[0]).getActivity(info[1]), time);
                        infoOutput.append("Time spent has been edited");
                        dispose();
                    }else {ok.setText("Project does not exist");}
                }
            });
        }else if(title.equals("Create Unavailable Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    int startweek = Integer.parseInt(info[1]);
                    int endweek = Integer.parseInt(info[2]);
                    program.getEmployee(employee).createUnavailablety(info[0],startweek,endweek);
                    infoOutput.append("Unavailable activity has been created");


                    dispose();
                }
            });
        }else if(title.equals("Join Activity")){
            ok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String[] info = getTextFromTextField(textField);
                    if (program.getProject(info[1]) != null) {
                        try {
                            program.getProject(info[1]).getActivity(info[2]).addEmployee(program.getEmployee(info[0]));
                        } catch (Exception ex) {
                            infoOutput.append("" + ex + "\n");
                        }
                        dispose();
                    }else {ok.setText("Project does not exist");}
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