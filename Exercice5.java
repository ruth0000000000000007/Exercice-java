import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrer les heures: ");
        int heures = clavier.nextInt();

        System.out.print("Entrer les minutes: ");
        int minutes = clavier.nextInt();

        System.out.print("Entrer les secondes: ");
        int secondes = clavier.nextInt();

        clavier.close();

        int tempsEcoule = heures * 3600 + minutes * 60 + secondes;

        int secondesAvantMinuit = 86400 - tempsEcoule;

        System.out.println("Il est " + heures + "h " + minutes + "min " + secondes + "s.");

        System.out.println("Il reste " + secondesAvantMinuit + " secondes avant minuit.");

    }

}
