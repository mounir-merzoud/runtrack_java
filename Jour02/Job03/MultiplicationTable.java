package Job03; // Définition du package Job03

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre pour afficher sa table de multiplication : ");
        int number = scanner.nextInt();

        // Affichage de la table de multiplication pour le nombre saisi
        System.out.println("Table de multiplication de " + number + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
