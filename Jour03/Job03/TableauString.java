package Job03;

public class TableauString {
    public static void main(String[] args) {
        // Création du tableau de String avec les noms donnés
        String[] tableauNoms = {"Josette", "John", "Myrtille", "Marc"};

        // Affichage de la valeur "John" dans le terminal (à l'index 1)
        System.out.println("Valeur à l'index 1 : " + tableauNoms[1]);

        // Modification de la valeur "Myrtille" en "Mireille"
        tableauNoms[2] = "Mireille";

        // Affichage des valeurs mises à jour du tableau
        System.out.print("Tableau après modification : ");
        afficherTableau(tableauNoms);
    }

    // Méthode pour afficher les valeurs d'un tableau de String
    public static void afficherTableau(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Saut de ligne après l'affichage du tableau
    }
    
}
