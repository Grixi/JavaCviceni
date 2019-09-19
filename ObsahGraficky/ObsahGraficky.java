//Made by:Adam Barta
import java.util.Scanner;
public class ObsahGraficky {
    public static void main(String[] args) {
        String sirka;
        String vyska;
        int sirkaCislo;
        int vyskaCislo;
        int obsah;

        Scanner scanner = new Scanner(System.in,"Windows-1250");
        System.out.println("Zadej sirku:");
        sirka = scanner.nextLine();
        System.out.println("Zadej vysku:");
        vyska = scanner.nextLine();

        vyskaCislo = Integer.parseInt(vyska);
        sirkaCislo = Integer.parseInt(sirka);

        obsah = vyskaCislo*sirkaCislo;
        System.out.println("Obsah je "+obsah);
        
        for (int y = 0; y < vyskaCislo; y++){

            for (int i = 0; i < sirkaCislo; i++) {
                System.out.print("* ");
           }
            
            System.out.println("");
        }

    }
}