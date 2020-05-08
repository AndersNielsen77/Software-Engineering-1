//Jana Jankovic s181482

package test.Project;

import Project.Project;
import org.junit.Test;
import Project.Employee;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
* Project Tester. 
* 
* @author <Authors name> 
* @since <pre>maj 5, 2020</pre> 
* @version 1.0 
*/ 
public class SetProjectLeaderTest {
/**
* 
* Method: setProjectLeader(Employee employee) 
* 
*/ 
    @Test
    public void testSetProjectLeaderA() throws Exception {
    Project project = new Project(2020,"is",1);
    Employee employee = new Employee("GGGG");
    project.addProjectLeader(employee);
    assertTrue(employee.getIsProjectLeader());
    }
    @Test
    public void testSetProjectLeaderB() throws Exception {
        Employee employee = new Employee("GGGG");
        Project project = new Project(2020, "Fisk", 1);
        try {
            project.addProjectLeader(employee);
        } catch(Exception e) {
            assertNotNull(e); }
    }
}
