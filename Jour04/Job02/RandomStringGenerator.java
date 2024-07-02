package Job02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la longueur de la chaîne aléatoire à générer
        System.out.print("Entrez la longueur de la chaîne aléatoire à générer : ");
        int length = scanner.nextInt();

        scanner.close();

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Générer la chaîne aléatoire
        String randomString = generateRandomString(length);

        // Écrire la chaîne dans un fichier output.txt
        writeToFile(randomString);

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
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
            System.out.println("Chaîne aléatoire générée et écrite dans output.txt avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
}
