package Job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        // Déclare deux variables entières num1 et num2
        int num1 = 10; // Valeur initiale pour num1
        int num2 = 20; // Valeur initiale pour num2

        // Affiche les valeurs initiales de num1 et num2
        System.out.println("Valeur initiale de num1 : " + num1);
        System.out.println("Valeur initiale de num2 : " + num2);

        // Échange les valeurs de num1 et num2
        int temp = num1; // Utilise une variable temporaire pour stocker la valeur de num1
        num1 = num2;     // Assigne la valeur de num2 à num1
        num2 = temp;     // Assigne la valeur stockée dans temp à num2

        // Affiche les nouvelles valeurs de num1 et num2 après l'échange
        System.out.println("Nouvelle valeur de num1 : " + num1);
        System.out.println("Nouvelle valeur de num2 : " + num2);
    }
}

