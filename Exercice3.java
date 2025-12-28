import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Enter les heures: ");
        int heures = clavier.nextInt();

        System.out.print("Entrer les minutes: ");
        int minutes = clavier.nextInt();

        System.out.print("Entrer les secondes : ");
        int secondes = clavier.nextInt();

        clavier.close();

        int secondesEcoulee = heures * 3600 + minutes * 60 + secondes;

        System.out.println("Il est " + heures + "h " + minutes + "min " + secondes + "s.");
        System.out.println("Il s'est écoulée " + secondesEcoulee + " secondes depuis minuit.");

    }
}
