package vetores;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		String a[] = new String [5];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor " + i + "..:");
			a [i]= ler.nextLine();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
		ler.close();


	}

}
