import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {

	static int menu() {
		menus();
		int op = (int)checa();
		return op;
	}

	
	static void menus() {
		System.out.println("\n=== MENU ===");
		System.out.println("(1) Soma");
		System.out.println("(2) Multiplicação");
		System.out.println("(3) Subtração");
		System.out.println("(4) Divisão");
		System.out.println("(5) Raiz Quadrada");
		System.out.println("(6) Potência");
		System.out.println("(7) Equação do Segundo Grau");
		System.out.println("(0) Sair");
		System.out.print("\nOpção: ");
	}
	
	static double checa() {
		double numero;
		Scanner ler = new Scanner(System.in);
		while (true) {
			try {
				numero = ler.nextInt();
				break;
			} catch (Exception e) {
				System.out.print("Por favor digite apenas números\n");
				ler.nextLine();
			}
		}
		return numero;
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

	static void segundoGrau() {
		Scanner ler = new Scanner(System.in);
		double a, b, c, xMais, xMenos, delta;

		System.out.println("Bem vindo a calculadora de segundo grau");
		System.out.println("Informe as variaveis da fórmula ax2+bx+c=0");
		System.out.println("Informe o valor de A");
		a = checa();

		if (a == 0) { // testa o valor de A, caso seja zero ele encerra
			System.out.println("O valor de A é zero, então não é equação de segundo grau");
			System.out.println("A calculadora sera encerrada");
		} else { // executa o programa caso A != 0
			System.out.println("Informe o valor de B");
			b = checa();
			System.out.println("Informe o valor de C");
			c = checa();

			delta = b * b - ((4 * a) * c); //resolve delta
			xMais = (b * (-1)) + Math.sqrt(delta); 
			xMenos = (b * (-1)) - Math.sqrt(delta);
			if (delta < 0) { //verifica se possui valores de X
				System.out.println("O delta é negativo\nA calculadora de segundo grau sera encerrada");
			} else if (delta == 0) { //verifica se possui somente 1 valor de X
				System.out.println("O delta vale zero então a equação possui apenas um valor de X");
				System.out.println("O valor de X é: " + xMais);
			} else { // equação com dois valores de X
				System.out.println("A equação possui duas raizes reais");
				System.out.println("Os valores são: X' = " + xMais + " X\"= " + xMenos);
			}

		}

	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		double n1 = 0, n2 = 0, resultado = 0;
		opcao = menu();
		
		switch (opcao) {
		case 7:
			segundoGrau();
			break;
		}
		
		do {
			opcao = menu();
			if (opcao >= 1 && opcao <= 4 || opcao == 6) {
					System.out.println("Digite o primeiro número da operação");
					n1 = checa();
					System.out.println("Digite o segundo número da operação");
					n2 = checa();
			} else if (opcao == 5) {
					System.out.println("Digite o número da operação");
					n1 = checa();
			}
			boolean apresentaResultado = true;
			switch (opcao) {
			case 0:
				apresentaResultado = false;
				break;
			case 1:
				resultado = soma(n1, n2);
				System.out.println("Soma");
				break;
			case 2:
				resultado = multiplicacao(n1, n2);
				System.out.println("Multiplicação");
				break;
			case 3:
				resultado = subtracao(n1, n2);
				System.out.println("Subtração");
				break;
			case 4:
				resultado = divisao(n1, n2);
				if (n2 == 0) {
					System.out.println("Valor Inválido para o Segundo Número!");
					apresentaResultado = false;
				}
				System.out.println("Divisão");
				break;
			case 5:
				resultado = raizQuadrada(n1);
				System.out.println("Raiz Quadrada");
				break;
			case 6:
				resultado = potencia(n1, n2);
				System.out.println("Potenciação");
				break;
			default:
				apresentaResultado = false;
				System.out.println("Opção Inválida!");
			}
			if (apresentaResultado) {
				System.out.println("Resultado: " + String.format("%.1f", resultado));
			}
		} while (opcao != 0);
		System.out.println("Obrigado volte sempre");
	}

}
