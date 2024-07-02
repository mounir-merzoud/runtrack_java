package Job12; // Assurez-vous que ce package correspond à votre structure de répertoire

import java.util.Scanner;

public class StringSwap {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la première chaîne
        System.out.print("Veuillez entrer la première chaîne de caractères (chaine1) : ");
        String chaine1 = scanner.nextLine(); // Lecture de la première chaîne

        // Demande à l'utilisateur de saisir la seconde chaîne
        System.out.print("Veuillez entrer la seconde chaîne de caractères (chaine2) : ");
        String chaine2 = scanner.nextLine(); // Lecture de la seconde chaîne

        // Affichage des valeurs avant l'échange
        System.out.println("Avant l'échange :");
        System.out.println("chaine1 : " + chaine1);
        System.out.println("chaine2 : " + chaine2);

        // Échange des valeurs sans utiliser de variable supplémentaire
        chaine1 = chaine1 + chaine2;  // Concaténation des deux chaînes dans chaine1
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // Extraction de l'ancienne valeur de chaine1
        chaine1 = chaine1.substring(chaine2.length()); // Extraction de l'ancienne valeur de chaine2

        // Affichage des valeurs après l'échange
        System.out.println("Après l'échange :");
        System.out.println("chaine1 : " + chaine1);
        System.out.println("chaine2 : " + chaine2);

        // Fermeture du scanner
        scanner.close();
    }
}
