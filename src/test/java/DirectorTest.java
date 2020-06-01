import org.junit.Before;
import org.junit.Test;
import staff.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("Dave", "GH 98C", 200.00, "Pencils",200000);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GH 98C", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Pencils", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0.01);
    }


    @Test
    public void canSetName(){
        director.setName("Dom");
        assertEquals("Dom", director.getName());
    }

    @Test
    public void canSetNiNumber(){
        director.setNiNumber("1");
        assertEquals("1", director.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(20000);
        assertEquals(20000, director.getSalary(), 0.01);
    }

    @Test
    public void canIncrementSalary(){
        director.raiseSalary(10);
        assertEquals(210.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(4, director.payBonus(), 0.01);
    }


}
