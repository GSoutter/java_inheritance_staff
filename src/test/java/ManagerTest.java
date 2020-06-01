import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Dave", "GH 98C", 200.00, "Pencils");
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GH 98C", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Pencils", manager.getDeptName());
    }


    @Test
    public void canSetName(){
        manager.setName("Dom");
        assertEquals("Dom", manager.getName());
    }

    @Test
    public void canSetNiNumber(){
        manager.setNiNumber("1");
        assertEquals("1", manager.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(20000);
        assertEquals(20000, manager.getSalary(), 0.01);
    }



}
