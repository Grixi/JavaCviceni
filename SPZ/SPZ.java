//Made with <3 by Adam Bárta
import java.util.Scanner;

public class SPZ {
    public static void main(String[] args) {
        boolean end = false;
        boolean hotovo = false;
        String input;
        String aktualniKraj;
        String inputKraj;
        String[][] kraje = {
            {"A", "B", "C", "E", "H", "J", "K", "L", "M", "P", "S", "T", "U", "Z"},
            {"Praha", "Jihomoravský kraj (Brno)", "Jihočeský kraj (České Budějovice)", "Pardubický kraj", "Královéhradecký kraj", "Kraj Vysočina (Jihlava)", "Karlovarský kraj", "Liberecký kraj", "Olomoucký kraj", "Plzeňský kraj", "Středočeský kraj", "Moravskoslezský kraj (Ostrava)", "Ústecký kraj", "Zlínský kraj"}
        };
        Scanner sc = new Scanner(System.in, "Windows-1250");

        while (!end){
            System.out.println("Zadej SPZ");
            input = sc.nextLine();

            inputKraj = String.valueOf(input.charAt(1));

            if (input.equals("Q")){
                end = true;
            } else if (input.length() != 7){
                System.out.println("Chybná SPZ");
            } else {
                for (int i = 0; i < 13 || !hotovo; i++){
                    aktualniKraj = kraje[0][i];

                    if (aktualniKraj.equals(inputKraj)){
                        System.out.println("Kraj vaší SPZ = " + kraje[1][i]);
                        hotovo = true;
                    }
                }
            }
        }
    }
}