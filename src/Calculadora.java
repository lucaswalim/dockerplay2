import java.util.Scanner;

public class Calculadora {

	public static double numero1;
	public static double numero2;
	public static int operacao = 1;
	public static int escolha;
	public static String cnpj;
	public static Scanner teclado = new Scanner(System.in);
	

	public static void calcular(int operacao, double numero1, double numero2) {
		if (operacao == 1) {
			System.out.println("O resultado da soma e de: " + soma(numero1, numero2));
			System.out.println("");
		}

		if (operacao == 2) {
			System.out.println("O resultado da subtracao e de: " + subtracao(numero1, numero2));
            System.out.println("");
		}

		if (operacao == 3) {
			System.out.println("O resultado da divisao e de: " + divisao(numero1, numero2));
            System.out.println("");
		}

		if (operacao == 4) {
			System.out.println("O resultado da multiplicacao e de: " + multiplicacao(numero1, numero2));
			System.out.println("");
		}
	}

	public static double subtracao(double numero1, double numero2) {
		return (numero1 - numero2);
	}

	public static double soma(double numero1, double numero2) {
		return (numero1 + numero2);
	}

	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}
}