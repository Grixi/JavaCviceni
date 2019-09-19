//Made by: Adam Barta
public class TestText{  
    String jmeno = "Adam";
    String prijmeni = new String("Barta"); 
    String heslo = "291A";
    String zadaneHeslo = "291a";
    String jmenoAprijmeni;
    int delkaJmena;
    int pozice;
    char znakDlePozice;
    String castPrijmeni;
    String bezMezer;
    int castJmena;

    public static void main(String[] args) {
        TestText t = new TestText();
        t.spoj();
        t.zmer();
        t.urciPozici();
        t.najdiCast();
        t.odstran();
        t.najdiCastDlePismen();
        t.vypis();
        t.porovnej();
        
    }

    public void spoj(){
        jmenoAprijmeni = ("   ")+jmeno.concat(prijmeni); //spoji jmeno a prijmeni
    }

    public void zmer(){
        delkaJmena = jmeno.length(); //vypocita delku jmena
    }

    public void urciPozici(){
        pozice = 2; //urci pozici pismena
        znakDlePozice = jmeno.charAt(pozice); //najde znak na pozici
    }

    public void najdiCast(){
        castPrijmeni = prijmeni.substring(2, 5); //najde cast prijmeni, zacne na "2" neskonci dokud neni pozice stejna jako "5"
    }

    public void odstran(){
        bezMezer = jmenoAprijmeni.trim(); //odstrani mezery
    }

    public void najdiCastDlePismen(){
        castJmena = jmeno.indexOf("da"); //najde pozici na ktere zacina "da" ve jmene
    }

    public void vypis(){
        System.out.println(jmeno.toLowerCase()); //vypise jmeno v lowerCase
        System.out.println(prijmeni.toUpperCase()); //vypise prijmeni v upperCase
        System.out.println(jmenoAprijmeni);
        System.out.println("Delka jmena je: " + delkaJmena);
        System.out.println("Znak na 3. pozici je: " + znakDlePozice);
        System.out.println("Cast prijmeni: " + castPrijmeni);
        System.out.println(bezMezer);
        System.out.println("da zacina na pozici: " + castJmena);
    }

    public void porovnej(){
        //porovna 2 stringy - heslo.equalsIgnoreCase(zadaneHeslo) porovna bez ohledu na velkost pismen
        if (heslo.equals(zadaneHeslo)) {
            System.out.println("Heslo OK");
        } else {
            System.out.println("Heslo ERROR");
        }
    }
}