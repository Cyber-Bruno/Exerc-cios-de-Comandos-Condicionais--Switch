import java.util.Scanner;

public class exerc�cio3 {

	public static void main(String[] args) {
		 
		Scanner leitor = new Scanner(System.in);
		int opc;
		
		System.out.println("Digite a op��o de 1 a 4 que deseja visualizar: ");
		opc = leitor.nextInt();
		
		switch(opc) {
		
		case 1:
			System.out.println("Executa a rotina de Inclus�o de Alunos");
		break;
		
		case 2:
			System.out.println("Executa a rotina de Altera��o de Alunos");
		break;
		
		case 3:
			System.out.println("Executa a rotina de Exclus�o de Alunos");
		break;
		
		case 4:
			System.out.println("Executa a rotina de Consulta de Alunos");
		break;
	}

}
	}
