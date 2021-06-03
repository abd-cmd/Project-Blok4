package blok4.domien;

import org.junit.jupiter.api.Test;

public class Projectmanager {

    private String naam;
    private int personeelnummer;


    public Projectmanager(String nm,int PN){
        naam = nm;
        personeelnummer = PN;
    }

    public String getNaam(){
        return naam;
    }

    public int getPersoneelnummer(){
        return personeelnummer;
    }


    public void setPersoneelnummer(int PN){
        personeelnummer = PN;
    }




}