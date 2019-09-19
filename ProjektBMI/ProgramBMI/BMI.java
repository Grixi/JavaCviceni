//Made by: Adam Barta
import java.util.Scanner;

public class BMI{
    String vyska;
    String vaha;
    double vahaI;
    double vyskaI;
    double bmi;

    public static void main(String[] args) {
        BMI bm = new BMI();
        bm.zadej(bm);
        bm.vypocti(bm);
        bm.rozhodni(bm);
    }

    public void zadej(BMI bm){
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadej vysku v metrech");
        vyska = sc.nextLine();
        
        System.out.println("Zadej vahu v kilogramech");
        vaha = sc.nextLine();
    }

    public void vypocti(BMI bm){
        vyskaI = Double.parseDouble(vyska);
        vahaI = Double.parseDouble(vaha);

        bmi = vahaI/(vyskaI*vyskaI);
        System.out.println("BMI = " + bmi);
    }

    public void rozhodni(BMI bm){
        if(bmi <= 16.5){
            System.out.println("Tezka podvyziva");
        }else if (bmi > 16.5 && bmi <= 18.5){
            System.out.println("Podvaha");
        }else if (bmi > 18.5 && bmi <= 25){
            System.out.println("Idealni vaha");
        }else if (bmi > 25 && bmi <= 30){
            System.out.println("Nadvaha");
        }else if (bmi > 30 && bmi <= 35){
            System.out.println("Obezita prvniho stupne");
        }else if (bmi > 35 && bmi <= 40){
            System.out.println("Obezita druheho stupne");
        }else if (bmi > 40){
            System.out.println("Obezita tretiho stupne");
        }
    }
}
