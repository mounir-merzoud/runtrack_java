package Job08;

public class SumThread extends Thread {
    private int start;
    private int end;
    private long partialSum;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }

    public static void main(String[] args) {
        final int NUM_THREADS = 10;
        final int MAX_NUMBER = 10000000;

        long startTime = System.currentTimeMillis();
        SumThread[] threads = new SumThread[NUM_THREADS];
        int segment = MAX_NUMBER / NUM_THREADS;

        // Créer et démarrer les threads
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * segment + 1;
            int end = (i + 1) * segment;
            threads[i] = new SumThread(start, end);
            threads[i].start();
        }

        // Attendre la fin de tous les threads
        try {
            for (SumThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calculer la somme totale
        long totalSum = 0;
        for (SumThread thread : threads) {
            totalSum += thread.getPartialSum();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Afficher les résultats
        System.out.println("Somme totale des nombres de 1 à " + MAX_NUMBER + " : " + totalSum);
        System.out.println("Temps d'exécution total : " + executionTime + " millisecondes");
    }
}
