import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PraceSoubory{
    String var;
    String nazevStudenta;
    String vyhledavatStudentaJmeno;
    int beepCount = 0;


    public static void main(String[] args){
      Scanner sc = new Scanner (System.in, "Windows-1250");
      PraceSoubory ps = new PraceSoubory();
      ps.chooseVar(sc, ps);
      ps.beep(ps);
    }
      public void chooseVar(Scanner sc, PraceSoubory ps){

              System.out.println("Zadejte jsetli chcete zapsat nebo hledat");
              var = sc.nextLine();
              if (var.equalsIgnoreCase("zapsat")) {
                ps.zapsat(ps, sc);
              }
              else if (var.equalsIgnoreCase("hledat")) {
                ps.hledat(ps, sc);
              }
              else{
                System.out.println("Chybně zapsano!!!");
                ps.chooseVar(sc, ps);
              }

      }
      public void zapsat(PraceSoubory ps,Scanner sc){
          System.out.println("Zapis jmena a prijemni");
          nazevStudenta = sc.nextLine();

          try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true)))
          {
              bw.write(nazevStudenta);
              bw.newLine();
              bw.flush();
          }
          catch (Exception e)
          {
              System.err.println("Do souboru se nepovedlo zapsat.");
          }
      }
      public void hledat(PraceSoubory ps,Scanner sc){

        System.out.println("Zapis jmeno nebo prijemni");
        vyhledavatStudentaJmeno = sc.nextLine();



        try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
        {
            String s;
            while ((s = br.readLine()) != null)
            {

              if (s.toLowerCase().contains(vyhledavatStudentaJmeno.toLowerCase())){
                System.out.println(s);
                int beepCount = 0;
                ps.beep(ps);

          }
          else{
            int beepCount = 4;
          }


            }
        }
        catch (Exception e)
        {
            System.err.println("Chyba při čtení ze souboru.");
        }

      }
      public void beep(PraceSoubory ps) {

        int beepCount = 5;
        for (int i = 0; i < beepCount; ++i)
          java.awt.Toolkit.getDefaultToolkit().beep();
          try {
            Thread.sleep(1000); // introduce delay
          } catch (InterruptedException e) {
          }
        }


    }
