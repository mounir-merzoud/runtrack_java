package Job12;

public class DiceCombinations {
    public static void main(String[] args) {
        int count = 0; // Compteur pour le nombre total de combinaisons

        // Boucles imbriquées pour simuler les trois dés
        for (int d1 = 1; d1 <= 6; d1++) {
            for (int d2 = 1; d2 <= 6; d2++) {
                for (int d3 = 1; d3 <= 6; d3++) {
                    // Afficher la combinaison
                    System.out.println(d1 + ", " + d2 + ", " + d3);
                    count++; // Incrémenter le compteur de combinaisons
                }
            }
        }

        // Afficher le nombre total de combinaisons
        System.out.println("Nombre total de combinaisons : " + count);
    }
}