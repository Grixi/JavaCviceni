
import java.util.Scanner;

public class RocniObdobi {

    public static void main(String[] args) {

        String jmeno;               
        String mesic;
        String rok;
        String rocniObdobi;  
        int rokCislo;    
        int vek;          
        int aktualniRok = 2018;     
        
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        
        System.out.println("Jake je tvoje jmeno?"); 
        
        jmeno = scanner.nextLine(); 
        
        System.out.println("Ve kterem mesici jsi se narodil?"); 
        
        mesic = scanner.nextLine(); 

        System.out.println("Ve kterem roce jsi se narodil?"); 
        
        rok = scanner.nextLine(); 

        rokCislo = Integer.parseInt(rok);

        if (aktualniRok >= rokCislo) {
            vek = aktualniRok - rokCislo;

            switch (mesic) {
                case "brezen": case "duben": case "kveten": rocniObdobi = "jare"; break;
                case "cerven": case "cervenec": case "srpen": rocniObdobi = "lete"; break;
                case "zari": case "rijen": case "listopad": rocniObdobi = "podzimu"; break;
                case "prosinec": case "leden": case "unor": rocniObdobi = "zime"; break;
                default: rocniObdobi = "budoucnosti"; break;
            }

            System.out.println(jmeno + " je " + vek + " let stary, narodil se v " + rocniObdobi);

        } else {
            System.out.println("Error- rok narozeni nemuze byt vetsi nez aktualni rok");
        }

        scanner.close();
    }
}