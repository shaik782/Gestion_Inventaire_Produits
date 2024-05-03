import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/voiture";
	private static final String LOGIN = "root";
	private static final String PSW = "password";

	public static Connection connect() {
		// Créer une connexion
		try {
			Connection connexion = DriverManager.getConnection(URL, LOGIN, PSW);
			System.out.println("Je suis connecté à ma base de données :-D");

			// Utiliser la connexion pour exécuter des ordres SQL
			return connexion
			
			// Parcourir les résultat
		}catch (SQLException e) {
			System.out.println("Erreur de connexion");
		}
		

	
	}		
}