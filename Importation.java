import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importation {

    private static final String CSV_FILE_PATH = "donnees_voiture.csv";

    public static void main(String[] args) {
        try {
            parseCSVData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseCSVData() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) { // Assurez-vous que chaque ligne contient au moins 8 éléments
                    String marque = data[0].trim();
                    String modele = data[1].trim();
                    String categorie = data[2].trim();
                    String couleur = data[3].trim();
                    int nombrePlace = Integer.parseInt(data[4].trim());
                    int annee = Integer.parseInt(data[5].trim());
                    float prix = Float.parseFloat(data[6].trim());
                    int quantite = Integer.parseInt(data[7].trim());

                    // Utilisez les variables selon vos besoins
                    System.out.println("Marque: " + marque);
                    System.out.println("Modele: " + modele);
                    System.out.println("Categorie: " + categorie);
                    System.out.println("Couleur: " + couleur);
                    System.out.println("Nombre de places: " + nombrePlace);
                    System.out.println("Annee: " + annee);
                    System.out.println("Prix: " + prix);
                    System.out.println("Quantite: " + quantite);
                    System.out.println();
                } else {
                    System.err.println("Erreur: La ligne ne contient pas assez de données.");
                }
            }
        }
    }
}