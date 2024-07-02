package Job08; // Définition du package Job08

import java.util.Arrays;

public class TriMatrice {
    public static void main(String[] args) {
        // Déclaration et initialisation de la matrice tableau
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Affichage de la matrice avant le tri
        System.out.println("Matrice avant le tri :");
        afficherMatrice(tableau);

        // Tri de chaque ligne de la matrice dans l'ordre croissant
        trierMatrice(tableau);

        // Affichage de la matrice après le tri
        System.out.println("\nMatrice après le tri :");
        afficherMatrice(tableau);
    }

    // Méthode pour afficher une matrice d'entiers dans le terminal
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println(); // Saut de ligne après chaque ligne de la matrice
        }
    }

    // Méthode pour trier une matrice dans l'ordre croissant
    public static void trierMatrice(int[][] matrice) {
        // Trier chaque ligne de la matrice dans l'ordre croissant
        for (int i = 0; i < matrice.length; i++) {
            Arrays.sort(matrice[i]);
        }

        // Transposer la matrice pour trier chaque colonne
        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length - 1; i++) {
                if (matrice[i][j] > matrice[i + 1][j]) {
                    // Échanger les éléments de la colonne si nécessaire
                    for (int k = 0; k < matrice.length; k++) {
                        int temp = matrice[k][j];
                        matrice[k][j] = matrice[k + 1][j];
                        matrice[k + 1][j] = temp;
                    }
                    // Réinitialiser i pour revérifier la même position
                    i = -1;
                }
            }
        }
    }
}
