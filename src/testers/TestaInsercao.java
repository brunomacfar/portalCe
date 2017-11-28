package testers;

import java.util.Scanner;
import DAO.MateriaisDAO;
import model.Materiais;


public class TestaInsercao {

	public static void main(String[] args) {
		
		Materiais mat = new Materiais();
		Scanner ler = new Scanner(System.in);
		String patrimonio;
		String descricao;
		String fabricante;
		String localidade;
		int qtdade;
		
			
		System.out.println("Insira o patrimônio do material:");
		mat.setPatrimonio(ler.nextLine());
		ler.nextLine();
		
		System.out.println("Insira uma descrição/nome para este material:");
		mat.setDescricao(ler.nextLine());
		ler.nextLine();
		
		System.out.println("Qual o fabricante do material?");
		mat.setFabricante(ler.nextLine());
		ler.nextLine();
		
		System.out.println("Qual a localidade do material?");
		mat.setLocalidade(ler.nextLine());
		ler.nextLine();
		
		System.out.println("Qual a quantidade deste Item?");
		mat.setQtdade(ler.nextInt());
		
		MateriaisDAO.insert(mat);
		
		
	}
}






















