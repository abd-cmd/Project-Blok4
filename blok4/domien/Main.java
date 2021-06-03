package blok4.domien;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Project P1 = new Project("NS Spoorwegen engineering","engineering",2000.000,39384, LocalDate.of(2021,12,12));

        Projectmanager PM1 = new Projectmanager("abd",178594);
        Projectmanager PM2 = new Projectmanager("ahmed",176992);

        Account A1 = new Account("admin1","abd1233@hotmail.com");
        Account A2 = new Account("admin2","ahmed1233@hotmail.com");

        FileDataSysteem F1 = new FileDataSysteem();
        F1.listVanProjects().add(P1);
        System.out.println(F1.listVanProjects());

    }

}
