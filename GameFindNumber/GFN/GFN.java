//Made by: Adam Barta
import java.util.Scanner;
import java.util.Random;

public class GFN{
    String pripraven;
    String cisloString;
    int nahodneCislo;
    int cislo;
    int pokus = 1;

    public static void main(String[] args) {
        GFN g = new GFN();
        Scanner sc = new Scanner(System.in, "Windows-1250");

        g.priprav(g, sc);
    }

    public void priprav(GFN g, Scanner sc){
        System.out.println("Jsi pripraven hrat hru? [ano/ne]");
        pripraven = sc.nextLine();
        if(pripraven.equalsIgnoreCase("ano")){
            g.generuj(g, sc);
        } else {
            System.out.println("Az budes pripraven spust me znovu");
            System.exit(0);
        }
    }

    public void generuj(GFN g, Scanner sc){ 
        Random rand = new Random();
        nahodneCislo = rand.nextInt(10) + 1;

        System.out.println("Myslim si cislo 1-10");
        g.uhadni(g, sc);
    }

    public void uhadni(GFN g, Scanner sc){
        System.out.println("Zadej cislo, ktere si myslim");
        cisloString = sc.nextLine();
        cislo = Integer.parseInt(cisloString);
        
        if(cislo == nahodneCislo){
            g.vyhra(g);
        } else {
            System.out.println("Zkus to znovu");
            pokus++;
            g.uhadni(g, sc);
        }
    }

    public void vyhra(GFN g){
        System.out.println("Gratuluji, je to cislo " + nahodneCislo);
        System.out.println("Pocet pokusu je: " + pokus);

        if(pokus <= 3){
            System.out.println("Jsi mentalista");
        }else if(pokus <=7 ){
            System.out.println("Jsi v prumeru");
        }else{
            System.out.println("Lepe se soustred");
        }
    }
}