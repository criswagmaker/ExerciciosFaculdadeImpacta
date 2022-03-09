import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int l1, l2, l3;
		
		System.out.println("Insira as medidas de um triângulo");
		l1 = sc.nextInt();
		l2 = sc.nextInt();
		l3 = sc.nextInt();
		
		System.out.print("\n");
		
		if(l1 == l2 && l1 == l3) {
			if(l2 == l3) {
				System.out.println("Triângulo Equilátero");
			}
		}
		if(l1 == l2 && l1 != l3) {
			System.out.println("Triãngulo Isósceles");
		}
		if(l2 == l3 && l2 != l1) {
			System.out.println("Triãngulo Isósceles");
		}
		if(l3 == l1 && l3 != l2) {
			System.out.println("Triãngulo Isósceles");
		}
		if(l1 != l2 && l1 != l3) {
			if(l2 != l3) {
				System.out.println("Triãngulo Escaleno");
			}
		}
	}
}
