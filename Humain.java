public class Humain implements Porteur {
    private int pv;
    private Identite id;
    private Virus[] v;

    public Humain(){
        this.pv=100;
        this.id=new Identite();
        this.v=new Virus[0];
    }
    public Humain(int p){
        this.pv=p;
    }

    public int getPV(){
        return this.pv;
    }

    public void gagnerPV(int p){
        this.pv+=p;
    }

    public void perdrePV(int p){
        this.pv-=p;
        if(this.pv<0){
            this.pv=0;
        }
    }

    public String toString(){
        String retour;
        retour="Prenom : " +id.getPrenom()+" Nom : "+id.getNom()+"Date de naissance : "+id.getDate()+" Points de vie : "+this.pv;
        return retour;
    }

    public void attaraperVirus(Virus va){
        Virus[] tmp=new Virus[v.length+1];
        for(int i=0;i<v.length;i++){
            tmp[i]=v[i];
        }
        tmp[tmp.length-1]=va;
        this.v=tmp;
    }

    public boolean supVirus(Virus va){
        boolean retour=false;
        boolean trouve=false;
        int place=0;
        int placeAsup=-1;
        while(!trouve && place<v.length){
            if(v[place].getNom()==va.getNom()){
                trouve=true;
                placeAsup=place;
            }
            place+=1;
        }
        if(placeAsup>=0){
            v[placeAsup]=null;
            Virus[] tmp = new Virus[v.length-1];
            for(int i=0;i<v.length;i++){
                if(v[i]!=null){
                    tmp[i]=v[i];
                }
            }
            v=tmp;
        }
        return retour;
    }
}
