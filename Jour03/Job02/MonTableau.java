package Job02; // Définition du package Job02

public class MonTableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec les valeurs initiales
        int[] monTableau = {12, 6, 76, 89};

        // Affichage des valeurs initiales du tableau
        System.out.print("Valeurs initiales du tableau : ");
        afficherTableau(monTableau);

        // Assignation de nouvelles valeurs au tableau
        monTableau[1] = 0;
        monTableau[3] = 20;

        // Affichage du contenu mis à jour du tableau
        System.out.print("Tableau après modification : ");
        afficherTableau(monTableau);
    }

    // Méthode pour afficher les valeurs d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Saut de ligne après l'affichage du tableau
    }
}
