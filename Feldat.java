package feldat;


public class Feldat {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        kiir(a+" + "+b+" = "+osszead(a, b));
        System.out.println("");
        kiir("AZ első 10 szám osszege: "+elso10SzamOsszege());
        System.out.println("");
    }

    private static int osszead(int a, int b) {
        return a+b;
    }

    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg +=i;
        }
        return osszeg;
        
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
    
}
