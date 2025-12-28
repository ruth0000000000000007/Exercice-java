import java.util.Scanner;
import java.util.Random;

public class jeuAléatoire {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Je pense à un nombre entr 1 et 100 inclus. Devinez lequel.");

        System.out.print("Entrer un nombre: ");
        int nombre = clavier.nextInt();

        System.out.println("Vous proposez " + nombre);

        int nombreAleatoire = r.nextInt(100) + 1;

        int difference = nombreAleatoire - nombre;

        clavier.close();

        System.out.println("Le nombre auquel je pensais était " + nombreAleatoire);

        System.out.println("Vous êtes à " + difference + " de la bonne réponse.");

    }

}
