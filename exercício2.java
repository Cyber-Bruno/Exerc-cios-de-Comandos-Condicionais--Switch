import java.util.Scanner;

public class exerc�cio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int cod;
		int und;
		
		System.out.println("Digite o c�digo do pedido: ");
		cod = leitor.nextInt();
		
		switch(cod) {
		
		case 100:
			System.out.println("Voc� pediu Cachorro quente, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 3,20"); }	
		break;
		
		case 101:
			System.out.println("Voc� pediu Bauru simples, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,30"); }	
		break;
		
		case 102:
			System.out.println("Voc� pediu Bauru com ovo, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 5,50"); }	
		break;
		
		case 103:
			System.out.println("Voc� pediu Hamb�rger, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 3,20"); }	
		break;
		
		case 104:
			System.out.println("Voc� pediu Cheeseburguer, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,30"); }	
		break;
		
		case 105:
			System.out.println("Voc� pediu Refrigerante, informe quantas unidades?");
			und = leitor.nextInt();
			
			if (und == 1) { System.out.println(" Valor a ser pago, 4,00"); }	
		break;
		
		
	

}
	}
}