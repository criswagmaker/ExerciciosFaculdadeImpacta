import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdMacas;
		float valorTotal;
		
		System.out.println("Quantas maçãs você deseja comprar?");
		qtdMacas = sc.nextInt();
		
		if(qtdMacas < 12) {
			valorTotal = (float) (qtdMacas * 0.30);
			System.out.println("Valor total das maçãs: R$" + valorTotal);
		}
		else {
			valorTotal = (float) (qtdMacas * 0.25);
			System.out.println("Valor total das maçãs: R$" + valorTotal);
		}
		
		

	}

}
