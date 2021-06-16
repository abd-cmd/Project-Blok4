package blok4;

import blok4.domien.Account;
import blok4.domien.Projectmanager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    public void VerkeerdeWachtwoordEnVerkeerdeEmailadres() {
        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        assertFalse("admni".equals(A1.getWachtwoord()));
        assertFalse("abd123@hotmail.com".equals(A1.getEmailadres()));
    }

    @Test
    public void JuisteWachtwoordEnVerkeerdeEmailadres() {
        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        assertEquals("admin1",(A1.getWachtwoord()));
        assertFalse("abd123@hotmail.com".equals(A1.getEmailadres()));
    }

    @Test
    public void JuisteWachtwoordEnJuisteEmailadres() {
        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        assertEquals("admin1",(A1.getWachtwoord()));
        assertEquals("abd1233@hotmail.com",(A1.getEmailadres()));
    }

    @Test
    public void VerkeerdeWachtwoordEnJuisteEmailadres() {
        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        assertFalse("admni".equals(A1.getWachtwoord()));
        assertEquals("abd1233@hotmail.com",(A1.getEmailadres()));
    }

    @Test
    public void AlsProjectManagerHeeftEenAccount() {
        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        Projectmanager PM1 = new Projectmanager("abd",178594);

        A1.setEmailadresEnWachtwoordVoorProjectmanager(PM1);

        assertTrue(A1.getAlsAccountBezitIs());

    }

    @Test
    public void AlsProjectManagerHeeftGeenAccount() {
        Account A1 = new Account("admin2","abd1233@hotmail.com","projectmanager");
        Projectmanager PM2 = new Projectmanager("ahmed",176992);


        assertFalse(A1.getAlsAccountBezitIs());
    }

    @Test
    public void SetNieuwWachtWoord(){
        Account A1 = new Account("admin2","abd1233@hotmail.com","projectmanager");

        A1.SetNewWachtWoord("admin");

        assertEquals("admin",A1.getWachtwoord());
    }

    @Test
    public void SetNieuwEmailadres(){
        Account A1 = new Account("admin2","abd1233@hotmail.com","projectmanager");
        A1.SetNewEmailadres("adam123@hotmail.com");

        assertEquals("adam123@hotmail.com",A1.getEmailadres());
    }
}