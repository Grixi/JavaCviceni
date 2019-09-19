//Made by: Adam Bárta (PeanutButte7)
import java.util.Random;

public class Pozdrav{
    boolean cislo;
    int nCislo = 0;

    public static void main(String[] args) { 
        Random rand = new Random();
        Pozdrav p = new Pozdrav();

        p.vratCislo(rand, p);
        p.jeSude(p);
        p.pozdrav(p);

    }

    public void vratCislo(Random rand, Pozdrav p){
        nCislo = rand.nextInt(10) + 1;
    }

    public void jeSude(Pozdrav p){
        if(nCislo%2 == 0){
            cislo = true;
        } else{
            cislo = false;
        }
    }

    public void pozdrav(Pozdrav p){
        if(cislo == true){
            System.out.println("Ahoj " + nCislo);
        } else {
            System.out.println("Hello " + nCislo);
        }
    }
}