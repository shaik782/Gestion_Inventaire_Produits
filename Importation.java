import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
					Connection connected = Connexion.Connect();

					try {
						
						PreparedStatement ps = connected.prepareStatement(
							"INSERT INTO produit(marque, modele, categorie, couleur, nombrePlace, annee, prix ,quantite) VALUES(?,?,?,?,?,?,?,?)"); 						{
						ps.setString(1, marque);
						ps.setString(2, modele);
						ps.setString(3, categorie);
						ps.setString(4, couleur);
						ps.setInt(5, nombrePlace);
						ps.setInt(6, annee);
						ps.setDouble(7, prix);
						ps.setInt(8, quantite);

						
						ps.executeUpdate();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						connected.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				// On sort du if s'il n'y a pas 8 elemenets
				} else {
					System.err.println("Erreur: La ligne ne contient pas assez de données.");
				}
			}
		}
	}
}
