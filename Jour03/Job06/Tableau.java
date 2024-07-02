package Job06; // Définition du package Job06

import java.util.Random;

public class Tableau {
    public static void main(String[] args) {
        // Création d'un tableau avec 10 nombres entiers aléatoires
        int[] tableau = genererTableauAleatoire(10);

        // Affichage du tableau dans le terminal
        System.out.println("Tableau de nombres entiers aléatoires :");
        afficherTableau(tableau);
    }

    // Méthode pour générer un tableau de nombres entiers aléatoires
    public static int[] genererTableauAleatoire(int taille) {
        Random random = new Random();
        int[] tableau = new int[taille];

        // Remplissage du tableau avec des nombres aléatoires entre 1 et 100 inclus
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(100) + 1; // Génère un nombre entre 1 et 100 inclus
        }

        return tableau;
    }

    // Méthode pour afficher les éléments d'un tableau d'entiers
    public static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println(); // Saut de ligne après l'affichage du tableau
    }
}
