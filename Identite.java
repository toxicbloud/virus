public class Identite {
    private String prenom;
    private String nom;
    private String date;

    public Identite(){
        this.prenom="john";
        this.nom="smith";
        this.date="08/11/2002";
    }

    public Identite(String pre,String no,String da){
        this.prenom=pre;
        this.nom=no;
        this.date=da;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getDate(){
        return this.date;
    }
}
