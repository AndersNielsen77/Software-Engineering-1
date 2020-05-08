package test.Project;

import Project.Employee;
import Project.Project;
import org.junit.Test;
import static org.junit.Assert.*;

/**
* Project Tester. 
* 
* @author <Authors name> 
* @since <pre>maj 5, 2020</pre> 
* @version 1.0 
*/ 
public class CreateActivityTest {
/**
* 
* Method: setProjectLeader(Employee employee) 
* 
*/ 
    @Test
    public void testCreateActivityA() throws Exception {
        Employee employee = new Employee("GGGG");
        Project project = new Project(2020, "Fisk", 1);
        project.addProjectLeader(employee);
        project.createActivity(employee, 10, 20, 34,"is");
        assertEquals("is",project.getActivity("is").getName());
    }
    @Test
    public void testCreateActivityB() throws Exception {
        Employee employee = new Employee("GGGG");
        Project project = new Project(2020, "Fisk", 1);
        try {
            project.createActivity(employee, 10, 20, 34,"is");
        } catch(Exception e) {
            assertNotNull(e); }
    }
}
