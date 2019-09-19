//Made by: Adam Barta
import java.util.Scanner;

public class RodneCislo{
    String rodneCisloString;
    long rodneCislo;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "Windows-1250");
        RodneCislo rc = new RodneCislo();

        rc.zadejCislo(sc);
        rc.vydel();
    }

    public void zadejCislo(Scanner sc){
        System.out.println("Zadej rodne cislo");
        rodneCisloString = sc.nextLine();
        rodneCislo = Long.parseLong(rodneCisloString);
    }

    public void vydel(){
        if(rodneCislo%11 == 0){
            System.out.println("Rodne cislo je platne");
        } else{
            System.out.println("Rodne cislo neni platne");
        }
    }
}
