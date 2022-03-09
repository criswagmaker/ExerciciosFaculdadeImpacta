import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nLados, mLados, area;
		
		System.out.println("Insira o número de lados do polígono");
		nLados = sc.nextInt();
		
		System.out.println("Insira a medida dos lados");
		mLados = sc.nextInt();
		
		if(nLados == 3) {
			System.out.println("\nTRIÂNGULO");
			area = (mLados * mLados) / 2;
			System.out.println("A área do triângulo é igual a " + area);
		}
		if(nLados == 4) {
			System.out.println("\nQUADRADO");
			area = mLados * mLados;
			System.out.println("A área do quadrado é igual a " + area);
		}
		if(nLados == 5) {
			System.out.println("PENTÁGONO");
		}
	}
}
