// Mikkel Rahbek s194298
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
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void ActionsListeners(String title,TextField[] textField,JButton ok){

        switch (title) {
            case "Create Project":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (info[0].matches("\\d+") && info[0].length() == 4 && info[1].length() > 0) {
                            int years = Integer.parseInt(info[0]);
                            program.addProject(years, info[1]);
                            infoOutput.append("Project Created with name: " + program.getProject(info[1]).getName() + "\n");
                            dispose();
                        } else {
                            ok.setText("Wrong input in year");
                        }
                    }
                });
                break;

            case "Set Project Leader":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (program.getProject(info[0]) != null && program.getEmployee(info[1]) != null && info[1].length() == 4 && info[0].length() > 0) {
                            try {
                                if (program.getProject(info[0]).getProjectLeader() == null) {
                                    program.getProject(info[0]).addProjectLeader(program.getEmployee(info[1]));
                                    infoOutput.append("The Project Leader of project"+info[0]+"is: "+info[1]+"\n");
                                }
                            } catch (Exception ex) {
                                infoOutput.append("" + ex + "\n");
                            }
                            dispose();
                        } else {
                            ok.setText("Wrong input");
                        }
                    }
                });
                break;

            case "Create an activity":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (info[2].matches("\\d*\\.\\d+") || info[2].matches("\\d+") && info[1].length() > 0 && info[0].length() == 4 && info[5].length() > 0) {
                            double time = Double.parseDouble(info[2]);
                            if (info[3].length() < 3 && info[4].length() < 3 && info[3].length()  > 0 && info[4].length() > 0 && info[4].matches("\\d+")) {
                                int startDate = Integer.parseInt(info[3]);
                                int endDate = Integer.parseInt(info[4]);
                                if (startDate > 0 && startDate < 54 && endDate > 0 && endDate < 54) {
                                    if (program.getProject(info[1]) != null && program.getProject(info[1]).getActivity(info[5]) != null ) {
                                        try {
                                            program.getProject(info[1]).createActivity(program.getEmployee(employee.getInitials()), time, startDate, endDate, info[5]);
                                            program.getProject(info[1]).getActivity(info[5]).addEmployee(program.getEmployee(info[0]));
                                            infoOutput.append("Activity " + info[5] + " has been created with attached the employee: " + program.getEmployee(info[0]).getInitials() + "\n");

                                        } catch (Exception ex) {
                                            infoOutput.append("" + ex + "\n");
                                        }
                                        dispose();
                                    } else {
                                        ok.setText("Project does not exist");
                                    }
                                } else {
                                    ok.setText("Error in Weeks");
                                }
                            } else {
                                ok.setText("Error in Weeks");
                            }
                        }else {ok.setText("Error in Time");}
                    }
                });
                break;

            case "Create Report":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (program.getProject(info[0]) != null && info[0].length() > 0) {
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
                            reportFrame.setLocationRelativeTo(null);
                            reportFrame.setVisible(true);
                            dispose();
                        } else {
                            ok.setText("Project does not exist");
                        }
                    }
                });
                break;

            case "Add time to Activity":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (info[2].matches("\\d*\\.\\d+") || info[2].matches("\\d+")) {
                            double time = Double.parseDouble(info[2]);
                            if (program.getProject(info[0]) != null && info[0].length() > 0 && info[1].length() > 0) {
                                program.getEmployee(employee.getInitials()).addTimeToActivity(program.getProject(info[0]).getActivity(info[1]), time);
                                infoOutput.append(program.getEmployee(employee.getInitials()).getTimeRegister(program.getProject(info[0]).getActivity(info[1])) + " hour(s) have been added to the activity"+"\n");
                                dispose();
                            } else {ok.setText("Project does not exist");}
                        }else {ok.setText("Error in Time");}
                    }
                });
                break;

            case "Edit time spent on Activity":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (info[2].matches("\\d*\\.\\d+") || info[2].matches("\\d+")) {
                            Double time = Double.parseDouble(info[2]);
                            if (program.getProject(info[0]) != null && info[0].length() > 0 && info[1].length() > 0) {
                                program.getEmployee(employee.getInitials()).editTimeOnActivity(program.getProject(info[0]).getActivity(info[1]), time);
                                infoOutput.append("Time spent on the activity"+info[1]+"in project"+info[0]+"has been edited"+"\n");
                                dispose();
                            } else {ok.setText("Project does not exist");}
                        }else{ok.setText("Error in Time");}
                    }
                });
                break;

            case "Create Unavailable Activity":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (info[1].matches("\\d+") && info[2].matches("\\d+") && info[0].length() > 0 && info[1].length() > 0 && info[2].length() > 0) {
                            int startweek = Integer.parseInt(info[1]);
                            int endweek = Integer.parseInt(info[2]);
                            program.getEmployee(employee.getInitials()).createUnavailablety(info[0], startweek, endweek);
                            infoOutput.append(info[0]+"from"+info[1]+"to"+info[2]+"is now registered."+"\n");
                            dispose();
                        }else {ok.setText("Error in Weeks");}
                    }
                });
                break;

            case "Join Activity":
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String[] info = getTextFromTextField(textField);
                        if (program.getProject(info[1]) != null && program.getProject(info[1]).getActivity(info[2]) != null && info[1].length() > 0 && info[2].length() > 0) {
                            try {
                                program.getProject(info[1]).getActivity(info[2]).addEmployee(program.getEmployee(info[0]));
                                infoOutput.append(info[0]+" has joined "+info[2]+" in" +info[1]+".\n");
                            } catch (Exception ex) {
                                infoOutput.append("" + ex + "\n");
                            }
                            dispose();
                        } else {ok.setText("Project does not exist");}
                    }
                });
                break;

            default:
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        dispose();
                    }
                });
                break;
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