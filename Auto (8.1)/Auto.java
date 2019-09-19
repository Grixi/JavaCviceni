public class Auto {
	public static void main (String[] args) {
        int Y;
        int X;

        Y = 2000;
        X = Y*12;

        if (X >= 220000 & X < 410000) {
            System.out.println ("Kup si Ladu Kalinu");
        }  else if (X >= 410000 & X < 2000000) {
            System.out.println ("Kup si Škodu Octavii");
        } else if (X >= 2000000){
            System.out.println ("Kup si S-Class");
        } else {
            System.out.println ("Najdi si lepší práci");
        }

    }
}
