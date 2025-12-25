import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        System.out.println("Bonjour Java");

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrer un nom: ");
        String nom = clavier.nextLine();

        System.out.print("Entrer un nombre: ");
        int nombre = clavier.nextInt();
        clavier.nextLine(); // nextInt() laisse l’Entrée dans la mémoire, donc nextLine() la lit tout de
                            // suite sans laisser écrire.

        System.out.print("Entrer un autre nom: ");
        String deuxiemeNom = clavier.nextLine();

        System.out.print("Entrer un adjectif: ");
        String adjectif = clavier.nextLine();

        clavier.close();

        System.out.println(
                "Il était une fois un " + nom + " qui avait " + nombre + " " + deuxiemeNom + ". "
                        + "Cela le rendait très " + adjectif + '.');

    }
}
