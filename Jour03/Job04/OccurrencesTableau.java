package Job04; // Définition du package Job04

import java.util.HashMap;
import java.util.Map;

public class OccurrencesTableau {
    public static void main(String[] args) {
        // Création du tableau avec les valeurs spécifiées
        int[] tableau = {3, 7, 3, 9, 8};

        // Appel de la méthode pour compter les occurrences
        Map<Integer, Integer> occurrences = compterOccurrences(tableau);

        // Affichage des résultats dans le terminal
        afficherOccurrences(occurrences);
    }

    // Méthode pour compter les occurrences de chaque nombre dans un tableau
    public static Map<Integer, Integer> compterOccurrences(int[] tableau) {
        // Initialisation d'une HashMap pour stocker les occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Parcours du tableau et comptage des occurrences
        for (int nombre : tableau) {
            if (occurrences.containsKey(nombre)) {
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                occurrences.put(nombre, 1);
            }
        }

        return occurrences;
    }

    // Méthode pour afficher les occurrences de chaque nombre
    public static void afficherOccurrences(Map<Integer, Integer> occurrences) {
        System.out.println("Occurrences des nombres dans le tableau :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
