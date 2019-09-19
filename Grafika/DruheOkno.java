import java.awt.*; //abstract window toolkit

import javax.swing.JCheckBox;
import javax.swing.*; //poskytuje graficke objekty (tlacitka atd)
import java.text.SimpleDateFormat; //poskytuje text
import java.util.Date; //datum

public class DruheOkno extends JFrame{

    public DruheOkno(){
        this.setTitle("Prvni Okno"); //nadpis okna 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program se ukonci pri zavreni okna
        this.setLocationRelativeTo(null); //nastavi pozici okna, null = levy kraj okna se nastavi na prostredek obrazovky
    }

    public static void main(String[] args){
        DruheOkno Okno = new DruheOkno();
        Color myColor = new Color(0, 0, 94); //deklaruje barvu 
        Color gray = new Color(64, 64, 64);
        JCheckBox popisek = new JCheckBox("Box");
        popisek.setFont(new Font("Courier", Font.PLAIN, 20)); //nastavi font
        popisek.setForeground(myColor); //nastavi barvu fontu
        popisek.setOpaque(true); //pruhlednost barvy backgroundu
        popisek.setBackground(gray); //nastavi barvu backgroundu
        Okno.add(popisek); //prida popisek na tridu PrvniOkno
        Okno.pack(); //nastavi velikost okna tak, aby se do nej vesly pridane elementy 
        Okno.setVisible(true); //true = okno jde videt, false = okno nejde videt

        for (int i = 1; i != 0; i++){
            boolean selected = popisek.isSelected(); //true nebo false podle toho jestli je selected

            if (selected == true){
                popisek.setBackground(myColor);
            } else if (selected == false) {
                popisek.setBackground(gray);
            }
        }
    }
}
