public class Main {
    public static void main (String[] args){
        Porteur p = new Humain();
        System.out.println(p.toString());
        Virus v=new Covid19();
        System.out.println(v.toString());
    }    
}
