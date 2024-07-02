package Job01; // Définition du package Job01

public class MyThread extends Thread {
    
    // Redéfinition de la méthode run() pour définir le comportement du thread
    public void run() {
        System.out.println("Mon thread est en cours");
    }

    public static void main(String[] args) {
        // Création d'une instance de MyThread
        MyThread monThread = new MyThread();
        
        // Démarrage de l'exécution du thread en appelant start()
        monThread.start();
    }
}
