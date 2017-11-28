package DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import model.Materiais;


public class MateriaisDAO {

	
	public List<Materiais> select() throws SQLException, Exception {
		Connection con = new ConnectionFactory().getConnection();

		List<Materiais> materiais = new ArrayList<Materiais>();
		try {
			String select = "select * from materiais;";
			PreparedStatement stmt = con.prepareStatement(select);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Materiais mat = new Materiais();
				mat.setPatrimonio(rs.getString("patrimonio"));
				mat.setDescricao(rs.getString("descricao"));
				mat.setFabricante(rs.getString("fabricante"));
				mat.setLocalidade(rs.getString("localidade"));
				mat.setQtdade(rs.getInt("qtdade"));

				materiais.add(mat);
			}
			rs.close();
			stmt.close();
			return materiais;
		} catch (Exception e) {
			System.out.print("Não foi possível fazer a conexão com o banco \n");
			e.printStackTrace();
		} finally {
			con.close();
		} return materiais;
	}

	
	public static void insert(Materiais material){
		Connection con = new ConnectionFactory().getConnection();
		
		String insert = "insert into materiais "+
		"(patrimonio, descricao, fabricante, localidade, qtdade)"+
				"values(?,?,?,?,?);";
		try {
			//preparesdS para a inserção
			PreparedStatement stmt = con.prepareStatement(insert);
			// setadno os valores
			stmt.setString(1, material.getPatrimonio());
			stmt.setString(2, material.getDescricao());
			stmt.setString(3, material.getFabricante());
			stmt.setString(4, material.getLocalidade());
			stmt.setInt(5, material.getQtdade());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível realizar o insert.. \n");
			throw new RuntimeException (e);
		}
		
		
	};
	
	
	
	public void update(){
		Connection con = new ConnectionFactory().getConnection();

	};

	
	
	public void delete(){
		Connection con = new ConnectionFactory().getConnection();

	};

}