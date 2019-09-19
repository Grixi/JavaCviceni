public class Cislo6 {
	public static void main (String[] args) {
        int cisloX;
        int cisloY;
        cisloX = 12;
        cisloY = 36;

        int zbytek1;
        int zbytek2;
        zbytek1 = cisloX%6;
        zbytek2 = cisloY%6;

        if (zbytek1 == 0 & zbytek2 == 0) {
		    System.out.println("Nasobek 6");
        } else {
            System.out.println("Neni nasobek 6");
        }
	}
}