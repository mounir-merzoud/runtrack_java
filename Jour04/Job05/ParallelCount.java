package Job05;

import java.util.Scanner;

public class ParallelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        scanner.close();

        // Mesurer le temps d'exécution global
        long startTime = System.currentTimeMillis();

        // Diviser le nombre maximum en deux plages de nombres égales
        int mid = maxNumber / 2;

        // Créer et démarrer deux threads pour compter les deux plages de nombres
        CountThread thread1 = new CountThread(1, mid);
        CountThread thread2 = new CountThread(mid + 1, maxNumber);

        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé leur exécution
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtenir et afficher le compte total
        int totalCount = thread1.getCount() + thread2.getCount();
        System.out.println("Compte total : " + totalCount);

        // Mesurer le temps écoulé et l'afficher
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }
}

// Classe de thread pour compter une plage de nombres donnée
class CountThread extends Thread {
    private int start;
    private int end;
    private int count;

    public CountThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    @Override
    public void run() {
        // Compter les nombres de 'start' à 'end'
        for (int i = start; i <= end; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
