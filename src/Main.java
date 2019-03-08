import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


 //       Terning[] terninger = fyldbæger();
//        System.out.println("antallet et terninger er" + terninger.length);

        boolean gentag = true;
//
//        while (gentag) {
//
//            visMeny();
//
//            int svar = getInt("angiv dit valg ");
//
//            switch (svar) {
//                case 1:
//                    rystBæger(terninger);
//                    break;
//                case 2:
//                    løftbæger(terninger);
//                    break;
//                case 3:
//                    fjernTerninger(terninger, getInt("hvilke terininger vi du fjerne ?"));
//                    break;
//                case 4:
//                    statestik(terninger);
//                    break;
//                default:
//                    gentag = false;
//                    break;
//
//            }


//            if (getString("tryk for q for quit").equalsIgnoreCase("q")){
//                break;
//            }


        int tal = getInt("skriv et tal");


    }


//        rystBæger(terninger);
//        løftbæger(terninger);
//        statestik(terninger);
//        fjernTerninger(terninger, getInt("hvilke terninger vil du fjerne ?"));
//        løftbæger(terninger);


//        Terning terning = new Terning();
//        terning.rul();
//        terning.setAktiv(false);
//        System.out.println(terning.tegnTerning());
    // }

    private static void visMeny() {
        System.out.println(" du har følgende valg :\n" +
                "tryk 1 for ryst bæger\n" +
                "tryk 2 for løft bæger\n" +
                "tryk 3 for fjernterninger\n" +
                "tryk 4 for stetestik\n" +

                "tryk andet for at stoppe\n"
        );
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
