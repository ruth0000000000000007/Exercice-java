public class Exercie2 {
    public static void main(String[] args) {
        int heure = 12;
        int minute = 34;
        int seconde = 56;

        int secondesEcoulee = heure * 3600 + minute * 60 + seconde;

        System.out.println("Il est " + heure + "h " + minute + "min " + seconde + "s.");

        System.out.println("Il s'est écoulée " + secondesEcoulee + " secondes depuis minuit.");

    }

}
