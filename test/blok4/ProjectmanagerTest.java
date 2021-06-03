
package blok4;
import blok4.domien.Projectmanager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectmanagerTest {

    @Test
    public void TestAlsProjectManagerJuistePersoneelNummerHeeft() {

        Projectmanager PM1 = new Projectmanager("abd",178594);

        assertEquals(178594,PM1.getPersoneelnummer());
    }

    @Test
    public void TestAlsProjectManagerJuisteNaamHeeft() {
        Projectmanager PM1 = new Projectmanager("abd",178594);
        assertEquals("abd",PM1.getNaam());
    }


    @Test
    public void TestAlsProjectManagerNietJuistePersoneelNummerHeeft() {
        Projectmanager PM1 = new Projectmanager("abd",178594);

        assertNotEquals(PM1.getPersoneelnummer(), 178473);
    }

    @Test
    public void TestAlsProjectManagerNietJuisteNaamHeeft() {
        Projectmanager PM1 = new Projectmanager("abd",178594);

        assertNotEquals(PM1.getNaam(), "ahmed");
    }


    @Test
    public void setNieuwPersoneelNummer(){
        Projectmanager PM1 = new Projectmanager("abd",178594);

        PM1.setPersoneelnummer(189200);
        assertEquals(189200,PM1.getPersoneelnummer());

    }
}