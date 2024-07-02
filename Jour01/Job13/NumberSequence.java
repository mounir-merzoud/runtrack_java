package Job13; // Indique le nom du package

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        System.out.print("Les nombres de 1 à " + nombre + " sont : ");
        for (int i = 1; i <= nombre; i++) {
            if (i < nombre) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

        scanner.close();
    }
}
