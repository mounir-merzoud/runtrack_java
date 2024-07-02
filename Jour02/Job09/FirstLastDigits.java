package Job09;

public class FirstLastDigits {
    public static void main(String[] args) {
        int number = 1234; // Nombre de référence
        
        // Récupérer le premier chiffre
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        // Récupérer le dernier chiffre
        int lastDigit = number % 10;
        
        // Afficher les résultats
        System.out.println("Premier chiffre de " + number + " : " + firstDigit);
        System.out.println("Dernier chiffre de " + number + " : " + lastDigit);
    }
}