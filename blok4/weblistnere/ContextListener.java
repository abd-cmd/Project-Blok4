package blok4.weblistnere;


import blok4.domien.Account;
import blok4.domien.FileDataSysteem;
import blok4.domien.Project;
import blok4.domien.Projectmanager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.LocalDate;
import java.util.Date;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override

    public void contextInitialized(ServletContextEvent sce) {
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, new Date(2021,12,12));

        Projectmanager PM1 = new Projectmanager("abd",178594);
        Projectmanager PM2 = new Projectmanager("ahmed",176992);

        Account A1 = new Account("admin1","abd1233@hotmail.com","projectmanager");
        Account A2 = new Account("admin2","ahmed1233@hotmail.com","projectmanager");

        FileDataSysteem F1 = new FileDataSysteem();
        F1.listVanProjects().add(P1);

        A1.setEmailadresEnWachtwoordVoorProjectmanager(PM1);
        A2.setEmailadresEnWachtwoordVoorProjectmanager(PM2);

        F1.listVanAccounts().add(A1);
        F1.listVanAccounts().add(A2);
    }
    public void contextDestroyed(ServletContextEvent sce){
       System.out.println("het is voorbij");
    }
}