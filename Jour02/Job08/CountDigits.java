package Job08;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre : ");
        int numero = scanner.nextInt();

        // Convertir le nombre en chaîne de caractères pour compter les chiffres
        String numeroStr = Integer.toString(numero);
        int nombreChiffres = numeroStr.length();

        // Afficher le nombre de chiffres
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreChiffres);

        scanner.close();
    }
}