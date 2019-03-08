import java.util.Random;
import java.util.StringJoiner;

public class Terning {


    // instans variabler.
    private int sideantal;
    private int resultat;
    private boolean aktiv;


    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public int getSideantal() {
        return sideantal;
    }


    public int getResultat() {


        return resultat;
    }




    //  constructor.
    public Terning(int sideantal) {
        this.sideantal = sideantal;
        this.aktiv = true;
    }

    //  constructor.
    public  Terning() {
        this.aktiv = true;
        this.sideantal=6;
    }

    // metode
    public int rul() {

        if(!aktiv) {
            return 0;
        }


        Random random = new Random();
        resultat = random.nextInt(sideantal)+1;
        return resultat;
    }




        public  String tegnTerning() {

        if (!aktiv) {
            return "";
        }

        switch (resultat) {

            case 1:
                return " **********\n" +
                        "*        *\n" +
                        "*    *   *\n" +
                        "*        *\n" +
                        "**********\n"
                ;

            case 2:
                return  "*********\n" +
                        "*    *  *\n" +
                        "*       *\n" +
                        "*    *  *\n" +
                        "*********\n"
                ;

            case 3:
                return  "**********\n" +
                        "* *      *\n" +
                        "*    *   *\n" +
                        "*      * *\n" +
                        "**********\n" ;

            case 4:
                return  "**********\n" +
                        "* *    * *\n" +
                        "*        *\n" +
                        "* *    * *\n" +
                        "**********\n" ;

            case 5:
                return  "**********\n" +
                        "* *    * *\n" +
                        "*    *   *\n" +
                        "* *    * *\n" +
                        "**********\n" ;

            case 6:
                return  "**********\n" +
                        "* *    * *\n" +
                        "* *    * *\n" +
                        "* *    * *\n" +
                        "**********\n" ;



            default:
                    return "terningen kunne ikke tegnes";


        }


   }

    @Override
    public String toString() {
        return new StringJoiner(", ", Terning.class.getSimpleName() + "[", "]")
                .add("sideantal=" + sideantal)
                .add("resultat=" + resultat)
                .toString();
    }
}



