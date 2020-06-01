import org.junit.Before;
import org.junit.Test;
import staff.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Dave", "GH 98C", 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GH 98C", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        developer.setName("Dom");
        assertEquals("Dom", developer.getName());
    }

    @Test
    public void canSetNiNumber(){
        developer.setNiNumber("1");
        assertEquals("1", developer.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(20000);
        assertEquals(20000, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncrementSalary(){
        developer.raiseSalary(10);
        assertEquals(210.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2, developer.payBonus(), 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void cannotConstructSalaryLessThan0(){
        developer = new Developer("Dave", "GH 98C", -200);
    }


}
