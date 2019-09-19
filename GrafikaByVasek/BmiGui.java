import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class BmiGui extends JFrame {
    private JLabel uvodniText;
    private JLabel uvodniText2;
    private JLabel uvodniText22;
    private JLabel uvodniText3;
    private JLabel uvodniText33;
    private JTextField vahaField;
    private JTextField vyskaField;
    private JButton vypocBut;
    private JLabel vysledekLab;
    private JLabel vychodiskoLab;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel22;
    private JPanel panel3;
    private JPanel panel33; 
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    
    public BmiGui() {
        super("Body Mass Index");
        FlowLayout layout = new FlowLayout(); //nastavi layout grafiky (napr. elementy se skaldaji pod sebe)
        setLayout(layout); //pouzije layout

        Color barva = new Color(255, 155, 155); //cervena
        Color barva2 = new Color(155, 255, 155); //zelena

        panel1 = new JPanel();
        panel1.setBackground(barva);
        add(panel1); //prida panel na okno

        panel2 = new JPanel();
        panel2.setBackground(barva);
        add(panel2);

        panel22 = new JPanel();
        panel22.setBackground(barva);
        add(panel22);

        panel3 = new JPanel();
        panel3.setBackground(barva);
        add(panel3);

        panel33 = new JPanel();
        panel33.setBackground(barva);
        add(panel33);

        panel4 = new JPanel();
        panel4.setBackground(barva2);
        add(panel4);

        panel5 = new JPanel();
        panel5.setBackground(barva2);
        add(panel5);
        
        panel6 = new JPanel();
        panel6.setBackground(barva2);
        add(panel6);

        uvodniText = new JLabel("Dobry den, vitejte u BMI kalkulacky."); //vytvori label s textem
        panel1.add(uvodniText); //prida graficky komponent v zavorkach na panel

        uvodniText2 = new JLabel("Zadejte prosim vahu v kilogramech");
        panel2.add(uvodniText2);

        uvodniText22 = new JLabel("a vysku v metrech(napr. 1.83).");
        panel22.add(uvodniText22);

        uvodniText3 = new JLabel("Kdyz budete psat vysku hlavne");
        panel3.add(uvodniText3);

        uvodniText33 = new JLabel("napiste misto desetine carky tecku.");
        panel33.add(uvodniText33);

        vahaField = new JTextField("Vaha", 5); //vytvori misto pro input textu, zadany text se zobrazi pred smazanim, cislo = sirka
        panel4.add(vahaField);

        vyskaField = new JTextField("Vyska", 5);
        panel4.add(vyskaField);

        vypocBut = new JButton("Vypocitej"); //vytvori button
        panel4.add(vypocBut);

        vypocBut.addActionListener( //detekuje akci v danem komponentu
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double vaha = Double.parseDouble(vahaField.getText()); //getText vytahne text z daneho komponentu
                    double vyska = Double.parseDouble(vyskaField.getText());
                    double vysledek = vaha / (vyska * vyska);
                    vysledekLab.setText("Vase BMI je: " + vysledek); //nadefinuje hodnotu v zavorkach do daneho komponentu

                    //if statementy pro rozhodnuti outputu
                    if(vysledek <= 18.5) {
                        vychodiskoLab.setText("Vychodisko je: " + "Mate podvahu.");
                    } else if(24.9 >= vysledek && vysledek >= 18.5) {
                        vychodiskoLab.setText("Vychodisko je: " + "Jste v norme");
                    } else if(29.9 >= vysledek && vysledek >= 25) {
                        vychodiskoLab.setText("Vychodisko je: " + "Mate nadvahu.");
                    } else if(34.9 >= vysledek && vysledek >= 30) {
                        vychodiskoLab.setText("Vychodisko je: " + "Mate obezitu 1. stupne.");
                    } else if(39.9 >= vysledek && vysledek >= 35) {
                        vychodiskoLab.setText("Vychodisko je: " + "Mate obezitu 2. stupne.");
                    } else if(vysledek >= 40) {
                        vychodiskoLab.setText("Vychodisko je: " + "Mate obezitu 3. stupne.");
                    }
                };
            }
        );

        vysledekLab = new JLabel("Vase BMI je: ");
        panel5.add(vysledekLab);

        vychodiskoLab = new JLabel("Vychodisko je: ");
        panel6.add(vychodiskoLab);
    }
} 