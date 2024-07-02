package Job07; // Définition du package Jour07

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre entier positif : ");
        int number = scanner.nextInt();

        // Vérifier que le nombre est positif
        if (number < 0) {
            System.out.println("Erreur : Le nombre doit être positif.");
        } else {
            // Calculer la factorielle du nombre
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Afficher le résultat
            System.out.println("La factorielle du nombre " + number + " est : " + factorial);
        }

        scanner.close();
    }
}
