import javax.swing.JFrame;

public class BmiGuiMain {
    public static void main(String [] args) {
        BmiGui okno = new BmiGui(); //nastavi program BmiGui do pod objekt "okno"

        //nastavuje parametry pro objekt
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setLocationRelativeTo(null);
        okno.setResizable(false);
    }
}