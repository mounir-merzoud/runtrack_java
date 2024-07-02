package Job07;

 

public class Matrices {
    public static void main(String[] args) {
        // Déclaration et initialisation de matrice1 et matrice2
        int[][] matrice1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrice2 = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };

        // Affichage des valeurs de matrice1
        System.out.println("Matrice1 :");
        afficherMatrice(matrice1);

        // Addition des matrices matrice1 et matrice2
        int[][] resultat = additionnerMatrices(matrice1, matrice2);

        // Affichage du résultat de l'addition
        System.out.println("\nRésultat de l'addition de matrice1 et matrice2 :");
        afficherMatrice(resultat);
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

    // Méthode pour additionner deux matrices d'entiers
    public static int[][] additionnerMatrices(int[][] matrice1, int[][] matrice2) {
        int lignes = matrice1.length;
        int colonnes = matrice1[0].length;
        int[][] resultat = new int[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return resultat;
    }
}
