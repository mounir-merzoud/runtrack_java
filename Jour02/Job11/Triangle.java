package Job11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        // Construire le triangle
        System.out.println("Triangle avec une hauteur de " + hauteur + ":");

        for (int ligne = 1; ligne <= hauteur; ligne++) {
            // Imprimer les espaces pour aligner les étoiles
            for (int espace = 1; espace <= hauteur - ligne; espace++) {
                System.out.print(" ");
            }

            // Imprimer les étoiles pour former le triangle
            for (int etoile = 1; etoile <= 2 * ligne - 1; etoile++) {
                System.out.print("*");
            }

            // Passer à la ligne suivante pour la prochaine rangée du triangle
            System.out.println();
        }

        scanner.close();
    }
}