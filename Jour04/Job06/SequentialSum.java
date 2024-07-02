package Job06;

import java.util.Scanner;

public class SequentialSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Créer un tableau pour stocker les nombres saisis
        int[] tableau = new int[size];

        // Demander à l'utilisateur de saisir les nombres dans le tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < size; i++) {
            System.out.print("élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        scanner.close();

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Calculer la somme de tous les nombres dans le tableau
        int sum = 0;
        for (int num : tableau) {
            sum += num;
        }

        // Mesurer le temps écoulé et l'afficher
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("Somme totale : " + sum);
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }
}
