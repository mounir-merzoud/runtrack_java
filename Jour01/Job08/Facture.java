package Job08;

public class Facture {
    public static void main(String[] args) {
        // Déclare les variables prix et quantite
        double prix = 49.99; // Prix unitaire du produit
        int quantite = 3;    // Quantité de produits

        // Calcule le montant hors taxe (HT)
        double tarifHT = prix * quantite;

        // Déclare et assigne la TVA
        double tva = 0.20; // 20% de TVA

        // Calcule le montant TTC
        double tarifTTC = tarifHT * (1 + tva);

        // Affiche les différentes valeurs de la facture
        System.out.println("Prix unitaire du produit : " + prix + " €");
        System.out.println("Quantité de produits : " + quantite);
        System.out.println("Montant hors taxe (HT) : " + tarifHT + " €");
        System.out.println("Taux de TVA : " + (tva * 100) + " %");
        System.out.println("Montant toutes taxes comprises (TTC) : " + tarifTTC + " €");
    }
}
