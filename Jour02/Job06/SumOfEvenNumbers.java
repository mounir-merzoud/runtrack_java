package Job06; // Définition du package Jour06

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0; // Variable pour stocker la somme des nombres pairs
        
        // Parcourir les nombres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            // Vérifier si le nombre est pair
            if (i % 2 == 0) {
                sum += i; // Ajouter le nombre pair à la somme
            }
        }
        
        // Afficher la somme des nombres pairs
        System.out.println("La somme des nombres pairs de 1 à 100 est : " + sum);
    }
}
