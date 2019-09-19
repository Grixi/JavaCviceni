public class Auto2 {
	public static void main (String[] args) {
        int Y; 
        int X; 

        Y = 2000;
        X = Y*12;

        if (X >= 220000) {
            if (X >= 2000000){
                System.out.println ("Kup si S-Class");
            } else {
                System.out.println ("Kup si Skodu Octavii");
            }
        } else {
            System.out.println ("Kup si Ladu Kalinu");
        }
        
    }
}