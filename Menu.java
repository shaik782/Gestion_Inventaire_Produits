import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu :");
            System.out.println("1. Rajout Voiture");
            System.out.println("2. Modifier Voiture");
            System.out.println("4. Supprimer Voiture");
            System.out.println("5. Importer Voiture");
            System.out.println("6. Exporter Voiture");
            System.out.println("7. Afficher Voiture");
            System.out.println("8. Quitter");
            System.out.print("Entrez votre choix: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Rajout Voiture");
                    break;
                case 2:
                    System.out.println("Vous avez choisi l'option 2.");
                    // Ajoutez le code de l'option 2 ici
                    break;
                case 3:
                    System.out.println("Vous avez choisi l'option 3.");
                    // Ajoutez le code de l'option 3 ici
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                case 6:
                    System.out.println("Vous avez choisi l'option 2.");
                    // Ajoutez le code de l'option 2 ici
                    break;
                case 7:
                    System.out.println("Vous avez choisi l'option 3.");
                    // Ajoutez le code de l'option 3 ici
                    break;
                case 8:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}