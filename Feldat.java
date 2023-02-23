package feldat;


public class Feldat {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        kiir(a+" + "+b+" = "+osszead(a, b));
        System.out.println("");
        kiir("AZ első 10 szám osszege: "+elso10SzamOsszege());
        System.out.println("");
        int osszeg = 0;
        osszeg = osszead(1, osszead(2,osszead(3, 4)));
        kiir("1+2+3+4="+osszeg+"\n");
        osszeg = osszead(3, osszead(4,2));
        kiir("SZámok összgenek gyöke: 3+4+2="+Math.sqrt(osszeg)+"\n");
        
        
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