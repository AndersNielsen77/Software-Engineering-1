package gui;

import Project.Employee;
import Project.Program;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    private JFrame jframe;
    private JPanel contentcenter;
    private JPanel contentsouth;
    private static Program program;
    private Employee employee;

    public static void main(String[] args) {
       program = new Program();
       LoginScreen loginScreen =  new LoginScreen(program);
    }

    public LoginScreen(Program program) {
        intialize();
        LoginScreen.program = program;
    }

    public void intialize() {
        jframe = new JFrame();
        jframe.setTitle("Login Screen");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().setLayout(new BorderLayout());

        contentcenter = new JPanel();
        contentcenter.setLayout(new GridLayout(2,0));

        TextField id = new TextField();
        JButton login = new JButton("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EmployeeID = id.getText();
                if(program.getEmployee(EmployeeID) != null) {
                    MainScreen mainscreen = new MainScreen(program, employee);
                    jframe.setVisible(false);
                }
                else {
                    login.setText("Wrong employee");
                }
            }
        });

        contentcenter.add(id);
        contentcenter.add(login);

        contentsouth = new JPanel();
        contentsouth.setLayout(new GridLayout(2,0));

        TextField initials = new TextField();
        JButton btnemployee = new JButton("Create Employee");
        btnemployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EmployeeID = initials.getText();
                employee = new Employee(EmployeeID);
                program.addEmployee(employee);
                initials.setText("");
        }
        });

        contentsouth.add(btnemployee);
        contentsouth.add(initials);

        jframe.getContentPane().add(contentcenter, BorderLayout.CENTER);
        jframe.getContentPane().add(contentsouth, BorderLayout.SOUTH);
        jframe.setSize(600, 600);
        jframe.setVisible(true);
    }
}
