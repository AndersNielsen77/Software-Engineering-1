// Anders Nielsen s194299
package gui;

import Project.Employee;
import Project.Program;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    private JFrame jframe;
    private JPanel contentCenter;
    private JPanel contentsouth;
    private JPanel contentNorth;
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
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content,BoxLayout.Y_AXIS));

        contentNorth = new JPanel();
        contentNorth.setLayout(new GridLayout(2,0,10,30));

        contentCenter = new JPanel();
        contentCenter.setLayout(new GridLayout(3,0,10,4));
        contentCenter.setMaximumSize(new Dimension(150,50));

        JTextField id = new JTextField();
        JButton login = new JButton("Login");

        contentCenter.add(id);
        contentCenter.add(login);


        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EmployeeID = id.getText();
                if(program.getEmployee(EmployeeID) != null) {
                    employee = program.getEmployee(EmployeeID);
                    MainScreen mainscreen = new MainScreen(program, employee);
                    jframe.setVisible(false);
                }
                else {
                    login.setText("Wrong employee");
                }
            }
        });

        contentsouth = new JPanel();
        contentsouth.setLayout(new GridLayout(3,0,10,4));
        contentsouth.setMaximumSize(new Dimension(150,50));

        TextField initials = new TextField();
        initials.setPreferredSize(new Dimension(100,40));
        JButton btnemployee = new JButton("Create Employee");
        btnemployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EmployeeID = initials.getText();
                if(EmployeeID.length() == 4){
                    employee = new Employee(EmployeeID);
                    program.addEmployee(employee);
                    initials.setText("");
                }
                else {
                    btnemployee.setText("Must be 4 letters");
                }
        }
        });

        contentsouth.add(initials,0);
        contentsouth.add(btnemployee,1);

        content.add(contentNorth);
        content.add(contentCenter);
        content.add(contentsouth);
        jframe.setContentPane(content);

        jframe.setSize(300,250);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
