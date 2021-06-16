package blok4.domien;

import java.util.ArrayList;
import java.util.List;

public class FileDataSysteem {

    private List<Project> projects = new ArrayList<>();
    private List<Account> Accounts = new ArrayList<>();

    public FileDataSysteem(){
    }

    public void setAccounts(List<Account> accounts){
        Accounts = accounts;
    }

    public List<Project> listVanProjects(){
        return projects;
    }

    public List<Account> listVanAccounts(){
        return Accounts;
    }


}