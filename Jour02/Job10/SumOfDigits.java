package Job10;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234; // Nombre de référence
        int sum = 0; // Variable pour stocker la somme des chiffres
        
        // Parcourir chaque chiffre du nombre
        while (number > 0) {
            int digit = number % 10; // Obtenir le dernier chiffre
            sum += digit; // Ajouter le chiffre à la somme
            number /= 10; // Retirer le dernier chiffre du nombre
        }
        
        // Afficher le résultat
        System.out.println("La somme des chiffres est : " + sum);
    }
    
}
