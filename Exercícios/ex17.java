import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lado;

		System.out.println("Insira o lado");
		lado = sc.nextInt();

		for (int i = lado; i > 0; i--) {
			for (int y = lado; y > 0; y--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
