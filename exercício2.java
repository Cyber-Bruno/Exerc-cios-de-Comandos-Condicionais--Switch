import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int cod;
		int und;
		
		System.out.println("Digite o código do pedido: ");
		cod = leitor.nextInt();
		
		switch(cod) {
		
		case 100:
			System.out.println("Você pediu Cachorro quente, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 3,20"); }	
		break;
		
		case 101:
			System.out.println("Você pediu Bauru simples, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,30"); }	
		break;
		
		case 102:
			System.out.println("Você pediu Bauru com ovo, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 5,50"); }	
		break;
		
		case 103:
			System.out.println("Você pediu Hambúrger, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 3,20"); }	
		break;
		
		case 104:
			System.out.println("Você pediu Cheeseburguer, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,30"); }	
		break;
		
		case 105:
			System.out.println("Você pediu Refrigerante, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,00"); }	
		break;
		
		
	

}
	}
}