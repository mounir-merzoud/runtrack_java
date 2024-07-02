package Job09;

public class MyString {
    public static void main(String[] args) {
        // Déclaration littérale
        String str1 = "Bonjour";

        // Utilisation du constructeur new String()
        String str2 = new String("Hello");

        // Copie d'une autre chaîne
        String sourceString = "CopyThis";
        String str3 = sourceString;

        // Concaténation de plusieurs parties
        String str4 = "Part1" + " " + "Part2";

        // Affiche les valeurs des variables de type String
        System.out.println("Déclaration littérale : " + str1);
        System.out.println("Utilisation du constructeur new String() : " + str2);
        System.out.println("Copie d'une autre chaîne : " + str3);
        System.out.println("Concaténation : " + str4);
    }
}
