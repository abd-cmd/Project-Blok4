package blok4.domien;

import org.junit.jupiter.api.Test;

public class Projectmanager {

    private String naam; // een string attribut
    private int personeelnummer; // een Integer attribut


    public Projectmanager(String nm,int PN){
        naam = nm;
        personeelnummer = PN;
        // de projectmanager constructor bevat twee parameters
    }

    public String getNaam(){
        // een getter voor de naam attribut
        return naam;
    }

    public int getPersoneelnummer(){
        // een getter voor de Personeelnummer
        return personeelnummer;
    }


    public void setPersoneelnummer(int PN){
        // een setter voor de Personeelnummer
        personeelnummer = PN;
    }




}