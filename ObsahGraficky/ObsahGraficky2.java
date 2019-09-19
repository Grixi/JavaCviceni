//Made by:Adam Barta
import java.util.Scanner;

public class ObsahGraficky2 {
    String sirka; //input sirky
    String vyska; //input vysky
    int sirkaCislo; //sirka - cislo
    int vyskaCislo; //vyska - cislo
    int obsah; //pro vypocet obsahu

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        ObsahGraficky2 og = new ObsahGraficky2();
        ObsahGraficky2 og1 = new ObsahGraficky2();
        ObsahGraficky2 og2 = new ObsahGraficky2();

        og.spustVysledek(og, sc);
        og.spustVysledek(og1, sc);
        og.spustVysledek(og2, sc);

        sc.close();
    }
    public void spustVysledek(ObsahGraficky2 og, Scanner sc){
        og.skenuj(sc);
        og.vypocti();
        og.vykresli();
    }
    //pta se na rozmery
    public void skenuj(Scanner sc){
        System.out.println("Zadej sirku:");
        sirka = sc.nextLine();
        System.out.println("Zadej vysku:");
        vyska = sc.nextLine();
    }
    //vypocita obsah
    public void vypocti(){
        vyskaCislo = Integer.parseInt(vyska);
        sirkaCislo = Integer.parseInt(sirka);
        obsah = vyskaCislo*sirkaCislo;
        System.out.println("Obsah je "+obsah);  
    }
    //vykresli obdelnik
    public void vykresli(){
        for (int y = 0; y < vyskaCislo; y++){

            for (int i = 0; i < sirkaCislo; i++) {
                System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
}