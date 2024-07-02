package Job07;

import java.util.Scanner;

public class ParallelSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Créer un tableau pour stocker les nombres saisis
        int[] tableau = new int[size];

        // Demander à l'utilisateur de saisir les nombres dans le tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < size; i++) {
            System.out.print("élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        scanner.close();

        // Diviser le tableau en deux moitiés
        int mid = size / 2;
        int[] firstHalf = new int[mid];
        int[] secondHalf = new int[size - mid];
        System.arraycopy(tableau, 0, firstHalf, 0, mid);
        System.arraycopy(tableau, mid, secondHalf, 0, size - mid);

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Créer et démarrer les threads pour calculer les sommes des deux moitiés
        SumThread thread1 = new SumThread(firstHalf);
        SumThread thread2 = new SumThread(secondHalf);
        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé leur exécution
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtenir les résultats des threads
        int sumTotal = thread1.getSum() + thread2.getSum();

        // Mesurer le temps écoulé et l'afficher
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("Somme totale : " + sumTotal);
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }
}

// Classe SumThread pour calculer la somme d'un tableau de nombres dans un thread
class SumThread extends Thread {
    private int[] array;
    private int sum;

    public SumThread(int[] array) {
        this.array = array;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int num : array) {
            sum += num;
        }
    }

    public int getSum() {
        return sum;
    }
}
