import java.util.Scanner;

public class Calculadora {

	static int menu() {
		System.out.println("\n=== MENU ===");
		System.out.println("(1) Soma");
		System.out.println("(2) Multiplicação");
		System.out.println("(3) Subtração");
		System.out.println("(4) Divisão");
		System.out.println("(5) Raiz Quadrada");
		System.out.println("(6) Potência");
		System.out.println("(0) Sair");
		System.out.print("\nOpção: ");
		Scanner leitor = new Scanner(System.in);
		int op = leitor.nextInt();
		return op;
	}

	static double soma(double n1, double n2) {
		return n1 + n2;
	}

	static double multiplicacao(double n1, double n2) {
		return n1 * n2;
	}

	static double subtracao(double n1, double n2) {
		return n1 - n2;
	}

	static double divisao(double n1, double n2) {
		return n1 / n2;
	}

	static double raizQuadrada(double n) {
		return Math.sqrt(n);
	}

	static double potencia(double n1, double n2) {
		return Math.pow(n1, n2);
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		double n1 = 0, n2 = 0, resultado = 0;
		do {
			opcao = menu();
			if (opcao >= 1 && opcao <= 4 || opcao == 6) {
				System.out.print("Primeiro Numero: ");
				n1 = leitor.nextDouble();
				System.out.print("Segundo Numero: ");
				n2 = leitor.nextDouble();
			} else if (opcao == 5) {
				System.out.print("Numero: ");
				n1 = leitor.nextDouble();
			}
			boolean apresentaResultado = true;
			switch (opcao) {
			case 0:
				apresentaResultado = false;
				break;
			case 1:
				resultado = soma(n1, n2);
				break;
			case 2:
				resultado = multiplicacao(n1, n2);
				break;
			case 3:
				resultado = subtracao(n1, n2);
				break;
			case 4:
				resultado = divisao(n1, n2);
				if (n2 == 0) {
					System.out.println("Valor Inválido para o Segundo Número!");
					apresentaResultado = false;
				}
				break;
			case 5:
				resultado = raizQuadrada(n1);
				break;
			case 6:
				resultado = potencia(n1, n2);
				break;
			default:
				apresentaResultado = false;
				System.out.println("Opção Inválida!");
			}
			if (apresentaResultado) {
				System.out.println("Resultado: " + String.format("%.1f", resultado));
			}
		} while (opcao != 0);
	}

}
