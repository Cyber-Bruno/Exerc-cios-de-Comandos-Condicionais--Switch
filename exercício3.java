import java.util.Scanner;

public class exercício3 {

	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner(System.in);
		int opc;
		
		System.out.println("Digite a opção de 1 a 4 que deseja visualizar: ");
		opc = leitor.nextInt();
		
		switch(opc) {
		
		case 1:
			System.out.println("Executa a rotina de Inclusão de Alunos");
		break;
		
		case 2:
			System.out.println("Executa a rotina de Alteração de Alunos");
		break;
		
		case 3:
			System.out.println("Executa a rotina de Exclusão de Alunos");
		break;
		
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
		break;
	}

}
	}
