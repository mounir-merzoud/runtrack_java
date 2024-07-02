package Job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringThreaded {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la longueur de la chaîne aléatoire à générer
        System.out.print("Entrez la longueur de la chaîne aléatoire à générer : ");
        int length = scanner.nextInt();

        scanner.close();

        // Générer la chaîne aléatoire
        String randomString = generateRandomString(length);

        // Diviser la chaîne en deux parties
        int mid = randomString.length() / 2;
        String firstHalf = randomString.substring(0, mid);
        String secondHalf = randomString.substring(mid);

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Créer et démarrer les threads pour écrire dans le fichier
        Thread writerThread1 = new Thread(() -> writeToFile(firstHalf));
        Thread writerThread2 = new Thread(() -> writeToFile(secondHalf));

        writerThread1.start();
        writerThread2.start();

        // Attendre que les threads aient terminé
        try {
            writerThread1.join();
            writerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mesurer le temps écoulé et l'afficher
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    private static void writeToFile(String randomString) {
        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(randomString);
            writer.flush(); // Forcer l'écriture dans le fichier immédiatement
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
}
