import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nLados, mLados, area;
		
		System.out.println("Insira o n�mero de lados do pol�gono");
		nLados = sc.nextInt();
		
		System.out.println("Insira a medida dos lados");
		mLados = sc.nextInt();
		
		if(nLados == 3) {
			System.out.println("\nTRI�NGULO");
			area = (mLados * mLados) / 2;
			System.out.println("A �rea do tri�ngulo � igual a " + area);
		}
		if(nLados == 4) {
			System.out.println("\nQUADRADO");
			area = mLados * mLados;
			System.out.println("A �rea do quadrado � igual a " + area);
		}
		if(nLados == 5) {
			System.out.println("PENT�GONO");
		}
	}
}
