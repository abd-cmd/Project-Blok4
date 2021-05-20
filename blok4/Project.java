package blok4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Project {
    private double projectbudget;
    private String projectnaam;
    private String projecttype;
    private LocalDate projectdatum;
    private int projectnummer;

    public Project(String naam, String type, double budget, int nummer, LocalDate datum){
        projectbudget = budget;
        projectnummer = nummer;
        projectdatum = datum;
        projectnaam = naam;
        projecttype = type;

    }

    public double getProjectbudget(){
        return projectbudget;
    }

    public LocalDate getProjectdatum(){
        return projectdatum;
    }

    public int getProjectnummer(){
        return projectnummer;
    }

    public String getProjectnaam(){
        return projectnaam;
    }

    public String getProjecttype(){
        return projecttype;
    }

    public void SetNewProjectBudget(double PB){
        projectbudget = PB;
    }
    public void SetNewProjectDatum(LocalDate PD){
        projectdatum = PD;
    }
    public void SetNewProjectNummer(int PN){
        projectnummer = PN;
    }
    public void SetNewProjectNaam(String PN){
        projectnaam = PN;
    }
    public void SetNewProjectType(String PT){
        projecttype = PT;
    }

    public String toString(){
        return "de project informatie : " + projectnaam + "," + projecttype + "," + projectnummer + "," + projectbudget + "," + projectdatum;
    }
}