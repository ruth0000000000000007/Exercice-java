import java.util.Scanner;

public class Parité1 {
    public static void demanderEntierEtAfficherParite() {
        System.out.print("Entrer un nombre: ");
        Scanner clavier = new Scanner(System.in);
        int nombre = clavier.nextInt();
        clavier.close();
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est pair");
        } else {
            System.out.println(nombre + " est impair");
        }

    }

    public static void main(String[] args) {
        demanderEntierEtAfficherParite();
    }

}
