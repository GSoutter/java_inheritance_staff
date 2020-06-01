import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Dave", "GH 98C", 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GH 98C", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(200.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("Dom");
        assertEquals("Dom", databaseAdmin.getName());
    }

    @Test
    public void canSetNiNumber(){
        databaseAdmin.setNiNumber("1");
        assertEquals("1", databaseAdmin.getNiNumber());
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(20000);
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncrementSalary(){
        databaseAdmin.raiseSalary(10);
        assertEquals(210.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2, databaseAdmin.payBonus(), 0.01);
    }

}
