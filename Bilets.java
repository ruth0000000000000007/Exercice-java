import java.util.Scanner;

public class Bilets {
    public static void estDepense() {
        Scanner console = new Scanner(System.in);

        System.out.print("Quel est votre nom: ");
        String nom = console.nextLine();

        System.out.print("Combien va dépenser " + nom + "? ");
        int montant = console.nextInt();

        console.close();

        int nbBillets = montant / 20;
        if (nbBillets * 20 < montant) {
            nbBillets++;
        }

        System.out.println(nom + " aura besoin de " + nbBillets + " billets de 20.");

    }

    public static void main(String[] args) {
        estDepense();
    }

}
