package Job04; // Définition du package Job04

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Les chiffres pairs de 0 à 100 sont : ");
        
        // Utilisation d'une boucle for pour afficher les chiffres pairs de 0 à 100
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " "); // Affiche chaque chiffre pair sur la même ligne
        }
        
        System.out.println(); // Pour passer à la ligne suivante à la fin de l'affichage
    }
}
