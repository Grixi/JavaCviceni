import java.awt.*; //abstract window toolkit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Repeatable;

import javax.swing.*; //poskytuje graficke objekty (tlacitka atd)
import java.text.SimpleDateFormat; //poskytuje text
import java.util.Date; //datum

public class KresliciPanel extends JPanel {

    public KresliciPanel() {
        this.setPreferredSize(new Dimension(400, 300));
        this.setFont(new Font("Courier", Font.BOLD, 20));
        this.setBackground(Color.RED);
    }

    public void kresli(){
        JTextField tf = new JTextField("baf");
        Color myColor = new Color(0, 0, 94); //deklaruje barvu 
        Color gray = new Color(64, 64, 64);

        tf.setFont(new Font("Courier", Font.PLAIN, 20)); //nastavi font
        tf.setForeground(myColor); //nastavi barvu fontu
        tf.setOpaque(true); //pruhlednost barvy backgroundu
        tf.setBackground(gray); //nastavi barvu backgroundu

        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                String zadanyText = tf.getText();
                System.out.println(zadanyText);
            }
        });

        System.out.println("asdasda");

        tf.setVisible(true);
    }    

    /*@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Kresleni textu
        g.drawString("Ahoj", 50, 80);
        g.setColor(Color.GREEN);
        g.drawString("Nazdar", 120, 70);
        g.setColor(Color.WHITE);
        g.drawString("Cau", 10, 210);

        // Kresleni car
        g.drawLine(30, 30, 200, 90);
        g.drawLine(50, 110, 90, 30); 
        g.setColor(Color.MAGENTA); //nastavi barvu pro tvary pod timto radkem
        g.drawLine(10, 250, 360, 40);

        // Kresleni a vyplnovani tvaru
        g.drawRect(300, 20, 65, 35);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(200, 150, 50, 30); 
        g.setColor(Color.WHITE);
        g.drawRect(200, 150, 50, 30);

        g.fillOval(320, 260, 70, 30);
        g.setColor(Color.CYAN);
        g.drawOval(320, 260, 70, 30);
    }*/
}