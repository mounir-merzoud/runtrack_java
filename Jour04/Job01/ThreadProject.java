// Fichier ThreadProject.java

package Job01; // Définition du package Job01

public class ThreadProject {
    
    public static void main(String[] args) {
        // Instanciation de la classe MyThread
        MyThread monThread = new MyThread();
        
        // Démarrage de l'exécution du thread en appelant start()
        monThread.start();
    }
}
