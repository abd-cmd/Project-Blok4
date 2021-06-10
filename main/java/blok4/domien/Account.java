package blok4.domien;

public class Account {
    private String wachtwoord;
    private String emailadres;
    private Projectmanager projectmanager;

    public Account(String Ww,String EA){
        wachtwoord = Ww;
        emailadres = EA;
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

    public String toString(){
        return "Account informatie : " + wachtwoord + " , " + emailadres;
    }

}