//Made by: Adam Barta
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ObcanskyPrukaz2{
    String rodneCislo;
    String jmeno;
    String prijmeni;
    String adresa;
    String cisloDokladu;
    String typOperaceString;
    Date rokNarozeni = null;
    Date datumVydani = null;
    Date platnostDo;
    char pohlavi;
    char typOperace;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "Windows-1250");
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        ObcanskyPrukaz2 op = new ObcanskyPrukaz2();
        op.nactiProgram(sc, df);
    }

    public void nactiProgram(Scanner sc, SimpleDateFormat df){
        vypisHelp();
        nactiHodnoty(sc, df);
    }

    public void nactiHodnoty(Scanner sc, SimpleDateFormat df){
        System.out.println("Zadej typ operace:");
        System.out.println("Zadej hodnotu:");
        typOperaceString = sc.nextLine();
        typOperace = typOperaceString.charAt(0);
        
        switch (typOperace){
            case 'R': setRodneCislo(rodneCislo, sc);
            break;
            case 'P': setPrijmeni(prijmeni, sc);
            break;
            case 'J': setJmeno(jmeno, sc);
            break;
            case 'A': setAdresa(adresa, sc);
            break;
            case 'C': setCisloDokladu(cisloDokladu, sc);
            break;
            case 'T': setPlatnostDo(platnostDo, sc, df);
            break;
            case 'V': setDatumVydani(datumVydani, sc, df);
            break;
            case 'Y': setRokNarozeni(rokNarozeni, sc, df);
            break;
            case 'X': setPohlavi(pohlavi, sc);
            break;
            case 'E': return;
        }
    }
    //help
    public void vypisHelp(){
        System.out.println("Znaky operace: R-rodne cislo; P-prijmeni; J-jmeno; A-adresa; C-cislo dokladu; T - platnost do; V-datum vydani; Y-rok narozeni; X-pohlavi; E-end konec");
    }
    //rodne cislo - R
    public void setRodneCislo(String rodneCislo, Scanner sc){
        rodneCislo = sc.nextLine();
        getRodneCislo();
    }
    public String getRodneCislo(){
        return this.rodneCislo;
    }
    //jmeno - J
    public void setJmeno(String jmeno, Scanner sc){
        jmeno = sc.nextLine();
        getJmeno();
    }
    public String getJmeno(){
        return this.jmeno;
    }
    //prijmeni - P
    public void setPrijmeni(String prijmeni, Scanner sc){
        prijmeni = sc.nextLine();
        getPrijmeni();
    }
    public String getPrijmeni(){
        return this.prijmeni;
    }
    //adresa - A
    public void setAdresa(String adresa, Scanner sc){
        adresa = sc.nextLine();
        getAdresa();
    }
    public String getAdresa(){
        return this.adresa;
    }
    //rok narozeni - Y
    public void setRokNarozeni(Date rokNarozeni, Scanner sc, SimpleDateFormat df){
        String rokNarozeniString = sc.nextLine();
        //rokNarozeni = df.parse(rokNarozeniString);
        getRokNarozeni();
    }
    public Date getRokNarozeni(){
        return this.rokNarozeni;
    }
    //datum vydani - V
    public void setDatumVydani(Date datumVydani, Scanner sc, SimpleDateFormat df){
        String datumVydaniString = sc.nextLine();
        //datumVydani = df.parse(datumVydaniString);
        getDatumVydani();
    }
    public Date getDatumVydani(){
        return this.datumVydani;
    }
    //platnost do - T
    public void setPlatnostDo(Date platnostDo, Scanner sc, SimpleDateFormat df){
        String platnostDoString = sc.nextLine();
        //platnostDo = df.parse(platnostDoString);
        getPlatnostDo();
    }   
    public Date getPlatnostDo(){
        return this.platnostDo;
    }
    //pohlavi - X
    public void setPohlavi(char pohlavi, Scanner sc){
        String pohlaviString = sc.nextLine();
        pohlavi = pohlaviString.charAt(0);
        getPohlavi();
    }
    public char getPohlavi(){
        return this.pohlavi;
    }
    //cislo dokladu - C
    public void setCisloDokladu(String cisloDokladu, Scanner sc){
        cisloDokladu = sc.nextLine();
        getCisloDokladu();
    }
    public String getCisloDokladu(){
        return this.cisloDokladu;
    }
}