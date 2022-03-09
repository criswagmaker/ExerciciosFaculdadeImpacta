import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Por favor, insira a senha para acessar a conta");
		senha = sc.nextInt();
		
		if(senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		}
		else {
			System.out.println("ACESSO NEGADO");
		}
	}

}
