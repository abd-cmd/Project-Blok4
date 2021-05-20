package blok4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileDataSysteem {

    private List<Project> projects = new ArrayList<>();
    private List<Account> Accounts = new ArrayList<>();

    public FileDataSysteem(){
    }


    public List<Project> listVanProjects(){
        return projects;
    }

    public List<Account> listVanAccounts(){
        return Accounts;
    }


}