import java.util.Scanner;

public class Parité2 {
    public static boolean estPair(int nb) {
        return nb % 2 == 0;

    }

    public static void demanderEntierEtAfficherParite() {
        System.out.print("Entrer un nombre: ");
        Scanner clavier = new Scanner(System.in);
        int nombre = clavier.nextInt();
        clavier.close();
        if (estPair(nombre)) {
            System.out.println(nombre + " est paire");
        } else {
            System.out.println(nombre + " est impaire");
        }

    }

    public static void main(String[] args) {
        demanderEntierEtAfficherParite();
    }

}
