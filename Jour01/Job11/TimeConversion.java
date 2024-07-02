package Job11; // Assurez-vous que ce package correspond à votre structure de répertoire

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer une durée en minutes
        System.out.print("Veuillez entrer une durée en minutes : ");
        int minutes = scanner.nextInt(); // Lecture de l'entrée utilisateur

        // Calcul des heures et des minutes
        int heures = minutes / 60; // Division entière pour obtenir les heures
        int resteMinutes = minutes % 60; // Reste de la division pour obtenir les minutes

        // Formatage du résultat en HH:MM
        String resultat = String.format("%02d:%02d", heures, resteMinutes);

        // Affichage du résultat
        System.out.println("La durée convertie est : " + resultat);

        // Fermeture du scanner
        scanner.close();
    }
}
