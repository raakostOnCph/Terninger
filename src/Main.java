import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int sideantal = 6;

        Terning [] ternings;
        int [] histogram = new int[sideantal-1];



        do{



        } while (getString("tryk j for at forsætte").equalsIgnoreCase("j"))





    }






    public static void statestik(Terning[] ternings) {

        int[] statestik = new int[ternings[1].getSideantal() + 1];

        for (Terning t : ternings
        ) {
            if (t.isAktiv()) {
                statestik[t.getResultat()]++;
            }
        }
        // System.out.println(Arrays.toString(statestik));

        for (int i = 0; i < statestik.length; i++) {

            System.out.println(i + " : " + statestik[i]);
        }


    }

    public static void fjernTerninger(Terning[] ternings, int i) {

        for (Terning t : ternings
        ) {
            if (t.getResultat() == i) {
                t.setAktiv(false);
            }
        }


    }

    public static void rystBæger(Terning[] terninger) {

        for (Terning t : terninger
        ) {
            t.rul();
        }

    }

    public static void løftbæger(Terning[] ternings) {

        for (Terning t : ternings) {
            System.out.println(t.tegnTerning());
        }


    }

    public static Terning[] fyldbæger() {

        Terning[] ternings = new Terning[getInt("hvor mange terninger ønsker du at spille med ?")];

        for (int i = 0; i < ternings.length; i++) {
            ternings[i] = new Terning();
        }

        return ternings;
    }


    public static String getString(String s) {

        System.out.println(s + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInt(String s) {

        int res;

        boolean ok = true;

        while (ok ) {

        ok = false;

            try {
                Integer.valueOf(getString(s));
            } catch (NumberFormatException e) {
               ok = true;
            }

        }



        return 0;
    }

}
