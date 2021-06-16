package blok4.domien;

import java.util.ArrayList;

public class Account {
    private  String wachtwoord;
    private  String emailadres;
    private  String role;
    private Projectmanager projectmanager;

    private static ArrayList<Account> accounts;

    static {
        accounts = new ArrayList<>();
        accounts.add(new Account("ssss","ssss","projectmanager"));
    }

    public Account(String Ww,String EA,String re){
        wachtwoord = Ww;
        emailadres = EA;
        role = re;
        accounts.add(this);
    }



    public String getWachtwoord(){
        return wachtwoord;
    }

    public String getEmailadres(){
        return emailadres;
    }

    public void SetNewWachtWoord(String Ww){
        wachtwoord = Ww;
    }

    public void SetNewEmailadres(String EA){
        emailadres = EA;
    }

    public void setEmailadresEnWachtwoordVoorProjectmanager(Projectmanager PM){
       this.projectmanager = PM;
    }

    public boolean getAlsAccountBezitIs(){
        return projectmanager != null;
    }

    public boolean checkWw(String Ww){
        return getWachtwoord().equals(Ww);
    }

    public static String validateLogin(String ww,String ea){
        for (Account A : accounts) {
            System.out.println(A);
            if (A.emailadres.equals(ea) && A.wachtwoord.equals(ww)) {
                return A.role;
            }
        }

        return null;
    }


}