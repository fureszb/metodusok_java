
package feldat;

import java.util.Random;

public class Equalizer {
    private static Random rnd = new Random();
     public static void main(String[] args) {
         eq();
         eq(12);
         eq(8, true);
         eq(true);

    }

    private static void eq(){
        int db = rnd.nextInt(3,7);
        eq(db);
    }
    private static void eq(int hossz){
        int db = hossz; 
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.print(szin+" ");
        }
        System.out.println("");
        }
    private static void eq(int hossz, boolean kiiras){
        int db = hossz; 
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.print(szin+" ");
        }
        if (kiiras == true) {
            System.out.printf("(%d)",db);
        }
        System.out.println("");
        }
     private static void eq(boolean kiiras){
        int db = rnd.nextInt(3,7);
        eq(db, kiiras);
    }
    
    

}
