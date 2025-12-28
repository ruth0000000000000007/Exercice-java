public class Exercice4 {
    public static void main(String[] args) {

        double premiereHeure = 12 * 3600 + 34 * 60 + 56;
        double deuxiemeHeure = 15 * 3600 + 27 * 60 + 12;
        double tempsEcoulee = deuxiemeHeure - premiereHeure;
        double tempsEnSeconde = tempsEcoulee * 100 / 86400.0;

        System.out.println("il était 12h 34 min 56s.");

        System.out.println("Il est 15h 27min 12 s.");

        System.out.println("Il s'est écoulé " + tempsEnSeconde + "% de temps par rapport à une journée.");

    }

}
