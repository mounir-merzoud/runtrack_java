package Job01; // Définition du package Job01

public class Tableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] tableau = new int[5];

        // Assignation des valeurs aux indices spécifiques
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        // Affichage du tableau dans le terminal
        System.out.print("Tableau : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Saut de ligne après l'affichage du tableau

        // Affichage de la valeur à l'index 1
        System.out.println("Valeur à l'index 1 : " + tableau[0]);
    }
}
