package Job05; // Définition du package Jour05

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Vérifier l'âge de l'utilisateur et afficher le résultat correspondant
        if (age < 16) {
            System.out.println("Vous êtes trop jeune pour travailler.");
        } else if (age >= 16 && age <= 55) {
            System.out.println("Vous avez l'âge pour travailler.");
        } else if (age == 67) {
            System.out.println("Vous êtes à l'âge de la retraite.");
        } else {
            System.out.println("Vous pourriez avoir du mal à trouver un emploi.");
        }

        scanner.close();
    }
}
