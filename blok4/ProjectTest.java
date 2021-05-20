
package blok4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {


    @Test
    public void TestAlsBudgetKloptVoorProject(){
       Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
       assertEquals(2000.000,P1.getProjectbudget());

    }

    @Test
    public void TestAlsDatumKloptVoorproject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertEquals(LocalDate.of(2021,12,12),P1.getProjectdatum());
    }
    @Test
    public void TestAlsNaamKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertEquals("NS Spoorwegen engineering",P1.getProjectnaam());
    }

    @Test
    public void TestAlsTypeKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertEquals("engineering",P1.getProjecttype());
    }

    @Test
    public void TestAlsNummerKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertEquals(39384,P1.getProjectnummer());
    }

    @Test
    public void TestAlsBudgetNietKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertNotEquals(2000.1212,P1.getProjectbudget());
    }

    @Test
    public void TestAlsDatumNietKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertNotEquals(LocalDate.of(2020,12,2),P1.getProjectdatum());
    }
    @Test
    public void TestAlsNaamNietKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertNotEquals("NS Spoorwegen bouwen",P1.getProjectnaam());
    }

    @Test
    public void TestAlsTypeNietKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        assertNotEquals("bouwen",P1.getProjecttype());
    }


    @Test
    public void TestAlsNummerNietKloptVoorProject(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        assertNotEquals(32324,P1.getProjectnummer());
    }

    @Test
    public void SetNieuwProjectNummer(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        P1.SetNewProjectNummer(92398);
        assertEquals(92398,P1.getProjectnummer());
    }

    @Test
    public void SetNieuwProjectType(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        P1.SetNewProjectType("bouwen");
        assertEquals("bouwen",P1.getProjecttype());
    }

    @Test
    public void SetNieuwProjectNaam(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        P1.SetNewProjectNaam("NS Spoorwegen bouwen");
        assertEquals("NS Spoorwegen bouwen",P1.getProjectnaam());

    }

    @Test
    public void SetNieuwProjectBudget(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        P1.SetNewProjectBudget(2122.212);
        assertEquals(2122.212,P1.getProjectbudget());
    }

    @Test
    public void SetNieuwProjectDatum(){
        Project P1 = new Project("NS Spoorwegen engineering","Engenering",2000.000,39384, LocalDate.of(2021,12,12));
        P1.SetNewProjectDatum(LocalDate.of(2022,1,4));
        assertEquals(LocalDate.of(2022,1,4),P1.getProjectdatum());
    }



}