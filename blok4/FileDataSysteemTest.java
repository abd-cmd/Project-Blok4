package blok4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FileDataSysteemTest {

    @Test
    public void TestAlsProjectzitInFileDataSysteem(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        FileDataSysteem F1 = new FileDataSysteem();
        F1.listVanProjects().add(P1);
        System.out.println(F1.listVanProjects());
        assertTrue(F1.listVanProjects().contains(P1));
    }

    @Test
    public void TestAlsAccountZitInFileDataSysteem(){
        Account A1 = new Account("admin1","abd1233@hotmail.com");
        FileDataSysteem F1 = new FileDataSysteem();
        F1.listVanAccounts().add(A1);
        System.out.println(F1.listVanAccounts());
        assertTrue(F1.listVanAccounts().contains(A1));
    }


    @Test
    public void TestAlsProjectNietzitInFileDataSysteem(){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));
        FileDataSysteem F1 = new FileDataSysteem();
        assertFalse(F1.listVanProjects().contains(P1));

    }

    @Test
    public void TestAlsAccountNietZitInFileDataSysteem() {
        Account A1 = new Account("admin1", "abd1233@hotmail.com");
        FileDataSysteem F1 = new FileDataSysteem();
        assertFalse(F1.listVanAccounts().contains(A1));
    }
}