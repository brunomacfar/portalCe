package testers;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author bruno
 *
 */
public class TestaConexao {
	
	
	public static void main(String[] args) throws SQLException, InterruptedException {
		Connection conexao = new ConnectionFactory().getConnection();
		System.out.println("Open Conection");	
		
		conexao.close();
	}
	
	
}
