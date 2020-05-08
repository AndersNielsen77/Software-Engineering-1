package test.Project;

import Project.Activity;
import Project.Employee;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
* Employee Tester. 
* 
* @author <Authors name> 
* @since <pre>maj 5, 2020</pre> 
* @version 1.0 
*/ 
public class IsAvailableTest {
/**
* 
* Method: isAvailable(int startWeek, int endWeek) 
* 
*/ 
    @Test
    public void testInputDataSetA() throws Exception {
            Employee employee = new Employee("GGGG");
            assertTrue(employee.isAvailable(12,14));
    }

    @Test
    public void testInputDataSetB() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 6, 10);
            assertTrue(employee.isAvailable(52,5));
    }

    @Test
    public void testInputDataSetC() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 5, 10);
            assertTrue(employee.isAvailable(12,14));
    }

    @Test
    public void testInputDataSetD() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 5, 10);
            assertTrue(employee.isAvailable(12,12));
    }

    @Test
    public void testInputDataSetE() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 1, 4);
            assertFalse(employee.isAvailable(52,5));
    }

    @Test
    public void testInputDataSetF() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 5, 10);
            assertFalse(employee.isAvailable(6,10));
    }

    @Test
    public void testInputDataSetG() throws Exception {
            Employee employee = new Employee("GGGG");
            employee.createUnavailablety("ferie", 5, 10);
            assertFalse(employee.isAvailable(7,7));
    }
}
