//Made by: Adam Barta
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class BMI extends JFrame{
    private JLabel uvodniText;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panelVyska;
    private JPanel panelVaha;
    public TextField vyska;
    public TextField vaha;
    double vahaI;
    double vyskaI;
    double bmi;

    public BMI(){
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        setLayout(layout);

        Color red = new Color(255, 155, 155); //cervena
        Color green = new Color(155, 255, 155); //zelena
        Color white = new Color(255, 255, 255); //bila
        Color gray = new Color(38, 38, 38); //seda
        Color blue = new Color(0, 0, 128); //navy

        panel1 = new JPanel();
        panel1.setForeground(gray);
        add(panel1);
        uvodniText = new JLabel("Zadej vysku:"); //vytvori label s textem
        panel1.add(uvodniText); //prida graficky komponent v zavorkach na panel

        panelVyska = new JPanel();
        panelVyska.setBackground(blue);
        add(panelVyska);
        vyska = new TextField(5);
        panelVyska.add(vyska);

        panel2 = new JPanel();
        panel2.setForeground(gray);
        add(panel2);
        uvodniText = new JLabel("Zadej vahu:"); 
        panel2.add(uvodniText);

        panelVaha = new JPanel();
        panelVaha.setBackground(blue);
        add(panelVaha);
        vaha = new TextField(5);
        panelVaha.add(vaha);

    }


    /*public void vypocti(BMI bm){
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
    }*/
}
