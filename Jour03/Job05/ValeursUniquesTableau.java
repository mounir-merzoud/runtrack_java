package Job05; // Définition du package Job05

import java.util.HashSet;
import java.util.Set;

public class ValeursUniquesTableau {
    public static void main(String[] args) {
        // Création du tableau avec des valeurs données
        int[] tableau = {3, 7, 3, 9, 8, 7, 7, 5, 5, 2, 8};

        // Appel de la méthode pour trouver les valeurs uniques
        Set<Integer> valeursUniques = trouverValeursUniques(tableau);

        // Affichage des valeurs uniques dans le terminal
        System.out.println("Valeurs uniques dans le tableau : " + valeursUniques);
    }

    // Méthode pour trouver les valeurs uniques dans un tableau d'entiers
    public static Set<Integer> trouverValeursUniques(int[] tableau) {
        // Utilisation d'un HashSet pour stocker les valeurs uniques
        Set<Integer> valeursUniques = new HashSet<>();

        // Parcours du tableau et ajout des valeurs uniques au HashSet
        for (int nombre : tableau) {
            valeursUniques.add(nombre);
        }

        return valeursUniques;
    }
}
