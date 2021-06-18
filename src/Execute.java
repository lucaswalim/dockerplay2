import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int escolha;
		int operacao;
		double numero1;
		double numero2;
		String cnpj;
		String continuar;

		do {

			System.out.println("O que voce deseja fazer ?");
			System.out.println("");
			System.out.println("1 - Calculadora");
			System.out.println("2 - Validar CNPJ");
			try {
				escolha = teclado.nextInt();

				if (escolha == 1) {
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("Selecione a Operacao Desejada");
					System.out.println("1 - Soma");
					System.out.println("2 - Subtracao");
					System.out.println("3 - Divisao");
					System.out.println("4 - Multiplicacao");
					operacao = teclado.nextInt();

					if (operacao >= 1 && operacao <= 4) {
						System.out.print("Informe um numero ");
						numero1 = teclado.nextDouble();
						System.out.println("");

						System.out.print("Informe o segundo numero ");
						numero2 = teclado.nextDouble();
						System.out.println("");

						Calculadora.calcular(operacao, numero1, numero2);
					}
				}

				if (escolha == 2) {
					System.out.print("Informe o CNPJ desejado: ");
					cnpj = teclado.next();
					boolean teste = ValidarCnpj.validarCNPJ(cnpj);
					if (teste) {
						System.out.println("");
						System.out.println("");
						System.out.println("CNPJ informado e Valido");
					} else {
						System.out.println("");
						System.out.println("");
						System.out.println("CNPJ informado e Invalido");
					}
				}

			} catch (Exception e) {
				System.out.println("");
				System.out.println("Opcao escolhida e invalida");
				break;

			}
			
			System.out.println("");
			System.out.print("Voce Deseja reiniciar? [SIM/NAO]");
			continuar = teclado.next();
		} while (continuar.equals("SIM") || continuar.equals("Sim") || continuar.equals("sim"));
	}
}
