package test.Project; 

import Project.Activity;
import Project.Employee;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/**
* Activity Tester. 
* 
* @author <Authors name> 
* @since <pre>maj 5, 2020</pre> 
* @version 1.0 
*/ 
public class AddEmployeeTest {
    /**
* 
* Method: addEmployee(Employee employee) 
* 
*/ 
    @Test
    public void testAddEmployeeA() throws Exception {
        Employee employee = new Employee("GGGG");
        Activity activity = new Activity(10, 5,10,"is");
        activity.addEmployee(employee);
        assertEquals(employee,activity.getEmployee("GGGG"));
    }

    @Test
    public void testAddEmployeeB() throws Exception {
        Employee employee = new Employee("GGGG");
        Activity activity = new Activity(10, 5,10,"is");
        employee.createUnavailablety("Ferie",6,7);
        assertNull(activity.getEmployee("GGGG"));
    }

    @Test
    public void testAddEmployeeC() throws Exception {
        Employee employee = new Employee("GGGG");
        Activity activity = new Activity(10, 5,10,"is");
        employee.createUnavailablety("Ferie",6,7);
        assertNull(activity.getEmployee("GGGG"));
    }
}
