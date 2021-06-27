package blok4.domien;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Project {
    private double projectbudget;// een double attribut
    private String projectnaam; // een String attribut
    private String projecttype;// een string attribut
    private Date projectdatum; // een Date attribut
    private int projectnummer; // een Integer attribut

    public Project(String naam, String type, double budget, int nummer, Date datum){
        projectbudget = budget;
        projectnummer = nummer;
        projectdatum = datum;
        projectnaam = naam;
        projecttype = type;
        // de project class constructor bevat vijf attributen
//        FileDataSysteem.getMyFileDataSysteem().listVanProjects().add(this);
    }


    public double getProjectbudget(){
        // de getter voor de projectbudget
        return projectbudget;
    }

    public Date getProjectdatum(){
        // de getter voor de projectdatum
        return projectdatum;
    }

    public int getProjectnummer(){
        // de getter voor de projectnummer
        return projectnummer;
    }

    public String getProjectnaam(){
        // de getter voor de projectnaam
        return projectnaam;
    }

    public String getProjecttype(){
        // de getter voor de projecttype
        return projecttype;
    }

    public void SetNewProjectBudget(double PB){
        // de setter voor de projectbudget
        projectbudget = PB;
    }
    public void SetNewProjectDatum(Date PD){
        // de setter voor de projectdatum
        projectdatum = PD;
    }
    public void SetNewProjectNummer(int PN){
        // de setter voor de projectnummer
        projectnummer = PN;
    }
    public void SetNewProjectNaam(String PN){
        // de setter voor de projectnaam
        projectnaam = PN;
    }
    public void SetNewProjectType(String PT){
        // de setter voor de projecttype
        projecttype = PT;
    }
//
//    public String toString(){
//        return "de project informatie : " + projectnaam + "," + projecttype + "," + projectnummer + "," + projectbudget + "," + projectdatum;
//    }
}