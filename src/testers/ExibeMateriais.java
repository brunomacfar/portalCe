package testers;

import java.sql.SQLException;
import java.util.List;

import DAO.MateriaisDAO;
import model.Materiais;

public class ExibeMateriais {

	public static void main(String[] args) throws SQLException, Exception {

		List<Materiais> lista = new MateriaisDAO(). select();
		for(Materiais mat : lista){
			System.out.println(mat.getPatrimonio());
			System.out.println(mat.getDescricao());
			System.out.println(mat.getFabricante());
			System.out.println(mat.getLocalidade());
			System.out.println(mat.getQtdade());

		}

	}
}

