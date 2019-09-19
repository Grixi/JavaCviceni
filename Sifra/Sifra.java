//Made with <3 by Adam Bárta
import java.util.Scanner;

public class Sifra {
    public static void main(String[] args) {
      String zadaneSlovo;
      char pismeno;
      Scanner sc = new Scanner(System.in, "Windows-1250");

      System.out.println("Zadej Slovo");
      zadaneSlovo = sc.nextLine();

      for (int i = 0; i > zadaneSlovo.length(); i++) {
        pismeno = zadaneSlovo.charAt(i);
        System.out.println(pismeno);
      }

  }
}
