public class Covid19 implements Virus {
    private int dgts;
    private int resistance;
    private String[] modesTrans;

    public Covid19(){
        this.dgts=10;
        this.resistance=100;
        this.modesTrans= new String[]{"air"};
    }

    public int getDegats(){
        return this.dgts;
    }

    public int getResistance(){
        return this.resistance;
    }

    public String[] getModeDeTransmission(){
        return modesTrans;
    }

    public String toString(){
        String retour="Mode(s) de transmissions : ";
        for(int i=0;i<modesTrans.length;i++){
            retour+=modesTrans[i]+" ";
        }
        return retour;
    }
}
