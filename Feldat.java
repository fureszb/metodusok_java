package feldat;


public class Feldat {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.printf("%d + %d = %d\n",a, b, osszead(a, b));
        System.out.println("AZ első 10 szám osszege: "+elso10SzamOsszege());
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
        System.out.println(szoveg);
    }
    
}
