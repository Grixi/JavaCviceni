//Made by: Adam Barta
import java.util.Scanner;

public class MenovaKalkulacka{
    String inputKurzUSD = null;
    String inputKurzE = null;
    String inputCastka = null;
    String inputCastkaCisla;
    int prevod1;
    int prevod2;
    int kurzE;
    int kurzUSD;
    int castka;
    int delka;

    public static void main(String[] args) {
        MenovaKalkulacka mk = new MenovaKalkulacka();

        System.out.println("Pro ukonceni zadej: end");
        mk.spust(mk);
    }
    
    public void spust(MenovaKalkulacka mk){
        mk.zadej(mk);
        mk.vypocti(mk);
    }
    
    public void zadej(MenovaKalkulacka mk) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadej kurz pro USD");
        inputKurzUSD = sc.nextLine();
        if(inputKurzUSD.equalsIgnoreCase​("end")){
            System.exit(0);
        }

        System.out.println("Zadej kurz pro Euro");
        inputKurzE = sc.nextLine();
        if(inputKurzE.equalsIgnoreCase​("end")){
            System.exit(0);
        }

        System.out.println("Zadej castku + znak: $ / Kc / E");
        inputCastka = sc.nextLine();
        if(inputCastka.equalsIgnoreCase​("end")){
            System.exit(0);
        }

    }

    public void vypocti(MenovaKalkulacka mk){
        kurzE = Integer.parseInt(inputKurzE);
        kurzUSD = Integer.parseInt(inputKurzUSD);

        delka = inputCastka.length();

        //Euro E
        if(inputCastka.endsWith("E")){
            delka = delka - 1;

            inputCastkaCisla = inputCastka.substring(0, delka);
            castka = Integer.parseInt(inputCastkaCisla);

            prevod1 = castka*kurzE;
            System.out.println("Kc = " + prevod1);
            prevod2 = prevod1/kurzUSD;
            System.out.println("USD = " + prevod2);
        //USD $
        } else if(inputCastka.endsWith("$")) {
            delka = delka - 1;

            inputCastkaCisla = inputCastka.substring(0, delka);
            castka = Integer.parseInt(inputCastkaCisla);

            prevod1 = castka*kurzUSD;
            System.out.println("Kc = " + prevod1);
            prevod2 = prevod1/kurzE;
            System.out.println("Euro = " + prevod2);
        //Koruna Kc
        } else if(inputCastka.endsWith("Kc")) {
            delka = delka - 2;

            inputCastkaCisla = inputCastka.substring(0, delka);
            castka = Integer.parseInt(inputCastkaCisla);

            prevod1 = castka/kurzUSD;
            System.out.println("USD = " + prevod1);
            prevod2 = castka/kurzE;
            System.out.println("Euro = " + prevod2);
        } else {
            System.out.println("Error - zadej menu");
        }

        mk.spust(mk);
    }
}
