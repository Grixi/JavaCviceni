public class Switch {
	public static void main (String[] args) {
        char pismeno = 'h';
        int bin;
        switch (pismeno) {
            case 'a': case 'e': case 'i': case 'o': case 'u': System.out.println("Jedna se o samohlasku"); break;
            default: System.out.println("Jedna se o souhlasku");
        }
    }
}