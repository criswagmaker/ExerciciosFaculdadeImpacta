
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int salarioMin, salarioUser, totalSalarios;
		
		System.out.println("Insira seu sal�rio: R$");
		salarioUser = sc.nextInt();
		
		System.out.println("Insira o valor do sal�rio m�nimo atual: R$");
		salarioMin = sc.nextInt();
		
		totalSalarios = salarioUser / salarioMin;
		
		System.out.println("Voc� ganha aproximadamente " + totalSalarios + " Sal�rios m�nimos");
		
		
	}

}
