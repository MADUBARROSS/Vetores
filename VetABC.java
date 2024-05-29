package vetores;

import java.util.Scanner;

public class VetABC {

	public static void main(String[] args) {
		int v1 [] = new int [5];
		int v2 [] = new int [5];
		int v3 [] = new int [10];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {

			System.out.println("Informe o valor " + i + ":");
			v1[i]= ler.nextInt();
			v3[i]=v1[i];

		}
		for (int i =5; i<10; i++) {

			System.out.println("Informe o valor " + i + ":");
			v2[i]= ler.nextInt();
			v3[i]=v2[i];
		}

		for (int i =0; i<10; i++) {
			System.out.println("A soma dos vetores é " + v3[i]);
		}

		ler.close();

	}

}
