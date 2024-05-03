import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connexion {
	
	private static final String URL = "jdbc:mysql://localhost:3306/voiture";
	private static final String LOGIN = "root";
	private static final String PSW = "password";

	public static void Connect() {
		// Créer une connexion
		try {
			Connection connexion = DriverManager.getConnection(URL, LOGIN, PSW);
			System.out.println("Je suis connecté à ma base de données :-D");


			
			// Parcourir les résultat
		}catch (SQLException e) {
			System.out.println("Erreur de connexion");
		}
		

	
	}		
}