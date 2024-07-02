package Job04;

import java.util.Scanner;

public class SequentialCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        scanner.close();

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Compter de 1 jusqu'au nombre maximum à l'aide d'une boucle
        int count = 0;
        for (int i = 1; i <= maxNumber; i++) {
            count++;
        }

        // Mesurer le temps écoulé et l'afficher
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Afficher le compte total et le temps d'exécution
        System.out.println("Compte total : " + count);
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }
}

