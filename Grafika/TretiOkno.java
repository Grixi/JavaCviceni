import java.awt.*; //abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Repeatable;

import javax.swing.*; //poskytuje graficke objekty (tlacitka atd)
import java.text.SimpleDateFormat; //poskytuje text
import java.util.Date; //datum

public class TretiOkno extends JFrame{

	public TretiOkno(){
        this.setTitle("Prvni Okno"); //nadpis okna 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program se ukonci pri zavreni okna
        this.setLocationRelativeTo(null); //nastavi pozici okna, null = levy kraj okna se nastavi na prostredek obrazovky
    }

    public static void main(String[] args){
        TretiOkno okno = new TretiOkno();
        Color myColor = new Color(0, 0, 94); //deklaruje barvu 
        Color gray = new Color(64, 64, 64);
        JTextField tf = new JTextField("baf");

        tf.setFont(new Font("Courier", Font.PLAIN, 20)); //nastavi font
        tf.setForeground(myColor); //nastavi barvu fontu
        tf.setOpaque(true); //pruhlednost barvy backgroundu
        tf.setBackground(gray); //nastavi barvu backgroundu

        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                String zadanyText = tf.getText();
                System.out.println(zadanyText);
                okno.paintComponent(okno, zadanyText);
            }
        });

        //okno.add(popisek); //prida popisek na tridu PrvniOkno
        okno.add(tf);
        okno.pack(); //nastavi velikost okna tak, aby se do nej vesly pridane elementy 
        okno.setVisible(true); //true = okno jde videt, false = okno nejde videt
    }

    public void paintComponent(TretiOkno okno, String zadanyText){

        // Kresleni textu
        okno.drawString("hi", 50, 80);
        System.out.println("yes");
    }    
}
