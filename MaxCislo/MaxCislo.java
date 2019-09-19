//Made by:Adam Barta
import java.util.Scanner;
public class MaxCislo {
    public static void main(String[] args) {
        String input;
        int inputCislo;
        int nejCislo = 0;

        Scanner scanner = new Scanner(System.in,"Windows-1250");

        do {
            System.out.println("Zadej cislo:");
            input = scanner.nextLine();
            inputCislo = Integer.parseInt(input);
            if (inputCislo > 0 && inputCislo > nejCislo) {
                nejCislo = inputCislo;
            }
        } while (inputCislo != 0);
        
        System.out.println("Nejvetsi cislo " + nejCislo);
    }
}