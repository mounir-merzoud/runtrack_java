package Job10; // Assurez-vous que ce package correspond à votre structure de répertoire

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du prénom
        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine(); // Lecture de l'entrée utilisateur pour le prénom

        // Demande du nom
        System.out.print("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine(); // Lecture de l'entrée utilisateur pour le nom

        // Concaténation des deux variables
        String nomComplet = prenom + " " + nom;

        // Affichage du résultat
        System.out.println("Bonjour, " + nomComplet + " !");

        // Fermeture du scanner
        scanner.close();
    }
}
