import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class BMIMain {
    public static void main(String [] args) {
        BMI okno = new BMI(); //nastavi program BmiGui do pod objekt "okno"

        //nastavuje parametry pro objekt
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(500, 500);
        okno.setLocationRelativeTo(null);
        okno.setResizable(true);
    }
} 