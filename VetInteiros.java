package vetores;

import java.util.Scanner;

public class VetInteiros {

	public static void main(String[] args) {
		int a[] = new int [5];
		int soma = 0;

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor " + i + "..:");
			a [i]= ler.nextInt();
			soma += a[i];
		}

		if (soma > 30) {
			System.out.println("A soma dos números é maior que 30");
			;
		}
		else {
			System.out.println("A soma dos números é menor que 30 ");

		}

		ler.close();

	}

}
