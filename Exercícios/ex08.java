import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano, idade;
		
		System.out.println("Em qual ano voc� nasceu? ");
		ano = sc.nextInt();
		
		idade = 2022 - ano;
		
		if(idade < 16) {
			System.out.println("Voc� n�o ainda n�o possui idade para votar!");
		}
		else {
			System.out.println("Voc� j� pode votar!");
		}
	}
}
