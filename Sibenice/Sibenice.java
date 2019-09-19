import java.util.Scanner;

public class Sibenice {

    public static void main(String[] args) {
        Stavba st = new Stavba();
        Databaze data = new Databaze();

        Scanner sc = new Scanner(System.in, "UTF-8");
        String slovo;

        int trest = 0;
        int vyhra = 0;

        slovo = data.ulozSlova();

        char[] postup = new char[slovo.length()];

        for(int i=0;i!=slovo.length();i++)
            postup[i] ='-';

        while (trest!=7&&vyhra!=slovo.length())
        {
            for(char c:postup)
                System.out.printf("%c",c);
            System.out.printf("\nZadejte písmeno: ");
            String volba = sc.nextLine();
            volba = volba.toLowerCase();
            if(slovo.contains(volba))
            {
                for(int i=0;i!=slovo.length();i++)
                    if(volba.equals(Character.toString(slovo.charAt(i)))&&
                       postup[i]!=slovo.charAt(i))
                    {
                        postup[i]=slovo.charAt(i);
                        vyhra+=1;
                    }
            }
            else{
                trest+=1;
                System.out.println(st.sibenice(trest, slovo));
            }
        }
        if(trest!=7)
            System.out.println("Vyhrál jste!");
    }
}
