package blok4.domien;

import java.util.ArrayList;
import java.util.List;

public class FileDataSysteem {

    private ArrayList<Project> projects = new ArrayList<>(); // lijst attribut van project die projects bevat
    // het koppelt ook dit class aan de class van project
    private ArrayList<Account> Accounts = new ArrayList<>(); // lijst attribut van Account die Accounts bevat
    // het koppelt ook dit class aan de class van Account

    public FileDataSysteem(){
    }

    private static FileDataSysteem myFileDataSysteem = new FileDataSysteem();// de static attribut die helpt om de class zelf aan te roepen
    public static FileDataSysteem getMyFileDataSysteem(){
        // de getter voor de static attribut
        return myFileDataSysteem;
    }


    public ArrayList<Project> listVanProjects(){
        //
        return projects;
    }

    public ArrayList<Account> listVanAccounts(){
        return Accounts;
    }


}