public class RajoutProduit extends MainConnection {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rajout d'une voiture:");
        System.out.println("Donner le nom de la marque");
        String marque = scanner.nextLine();
        System.out.println("Donner le nom du modèle");
        String modèle = scanner.nextLine();
        System.out.println("Donner le type de catégorie de la voiture (familiale,sportif,voyage)");
        String categorie = scanner.nextLine();
        System.out.println("Donner la couleur de la voiture");
        String couleur = scanner.nextLine();
        System.out.println("Donner l'année de production de la voiture");
        String annee = scanner.nextInt();
        System.out.println("Donner le prix unitaire de la voiture");
        String prix = scanner.nextFloat();
        System.out.println("Donner la quantité de cette voiture");
        String quantite = scanner.nextInt();
        System.out.println("Donner le nombre de place dans cette voiture");
        String nbplace = scanner.nextInt();
        System.out.println("8. Quitter");
        System.out.print("Entrez votre choix: ");
        Connection connect = MainConnection.connect();
        Statement requete = connexion.createStatement();
        ResultSet listeProduits = requete.executeQuery("SELECT * FROM produit");
    }

}