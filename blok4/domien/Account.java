package blok4.domien;

import java.io.PrintWriter;
import java.security.Principal;
import java.util.ArrayList;

public class Account implements Principal {
    private  String wachtwoord; // een string attribut
    private  String emailadres; // een string attribut
    private final String role; //  een string attribut
    private Projectmanager projectmanager; // een projectmanager attrinut omdat dit claas gekoppeld is aan de projecctmanager class

    private static final ArrayList<Account> accounts; // een static  list van accounts om accounts toe te voegen
                                                      // het is belangrijk omdat het gebruikt wordt voor de functions validatelogin en getuserbyname

    static {
        accounts = new ArrayList<>();
        accounts.add(new Account("ssss","ssss","projectmanager"));
    }

    public Account(String Ww,String EA,String re){
        wachtwoord = Ww;
        emailadres = EA;
        role = re;
        accounts.add(this);
        // dit is de constructor die gebruikt wordt voor de class account
        // de parameters zijn de attributen
    }

    public String getRole() {
        //de getter voor de role attribut
        return role;
    }

    public String getWachtwoord(){
        // de getter voor de wachtwoord attribut
        return wachtwoord;
    }

    public String getEmailadres(){
        // de getter voor de emailadres attribut
        return emailadres;
    }

    public void SetNewWachtWoord(String Ww){
        // de setter voor de wachtwoord attribut
        wachtwoord = Ww;
    }

    public void SetNewEmailadres(String EA){
        // de setter voor de emailadres attribut
        emailadres = EA;
    }

    public void setEmailadresEnWachtwoordVoorProjectmanager(Projectmanager PM){
        // de setter om het account class te kopplen aan de projectmanager class
       this.projectmanager = PM;
    }

    public boolean getAlsAccountBezitIs(){
        // een functie om te checken of het account is gekoppeld aan een projectmanager
        return projectmanager != null;
    }


    public static String validateLogin(String ww,String ea){ // dit functie wordt gebruikt in de authenticationResource class
        for (Account A : accounts) {                      // het zorgt dat een toegang wordt gegeven als de emailadres en de wachtwoord kloppen
            System.out.println(A);
            //voor elke account in het lijst van aacounts
            if (A.emailadres.equals(ea) && A.wachtwoord.equals(ww)) { // als de emailadres en de (ea) parameter gelijk zijn en als de wachtwoord en de (ww) parameter gelijk zijn
                return A.role;
                //wordt de role geretourneerd
            }
        }
        return null;
    }

    public static Account getUserByName(String emailadres){// het wordt gebruikt in de authenticationfilter
          for (Account account:accounts){// voor elke aacount in lijst van accounts
              if (account.emailadres.equals(emailadres)){// als het emailadres van de account gelijk is aan de emailadres paramerter
                  return account;
                  // wordt de account geretourneerd
              }
          }
          return null;
    }


    @Override
    public String getName() { // dit getter wordt geïmplementeerd voor de Principal
        return emailadres;    // het retourneert de emailafres maar het heet de naam (getnaam) door de Principal
    }
}