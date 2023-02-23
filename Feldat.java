package feldat;


public class Feldat {

    public static void main(String[] args) {
        
        
        
    }

    private static void osszead(int a, int b) {
        System.out.printf("%d + %d = %d\n",a,b,a+b);
    }

    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg +=i;
        }
        kiir("Az első 10 szám összege: "+osszeg);
        
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    
}
