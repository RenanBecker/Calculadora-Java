import java.util.Scanner;
public class calculadora {
	public static void main(String[] args){
		int primeiro;
		int segundo;
		int resultado;
		String operacao;
    char novamente = 'a';
    
    System.out.println("Bem vindo ao programa Calculadora");
    do{
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número da operação");
        primeiro = ler.nextInt();
        System.out.println("Escolha a operação que deseja realizar\n+ para somar\n- para subtrair\n* para multiplicar\n/ para dividir");
        operacao = ler.next();
        System.out.println("Digite o segundo número da operação");
        segundo = ler.nextInt();
        switch (operacao) {
          case "+":
            resultado = primeiro + segundo;
            System.out.println(primeiro + " + " + segundo +  " = " + resultado);
            break;
          case "-":
            resultado = primeiro - segundo;
            System.out.println(primeiro + " - " + segundo +  " = " + resultado);
            break;
          case "*":
            resultado = primeiro * segundo;
            System.out.println(primeiro + " * " + segundo +  " = " + resultado);
            break;
          case "/":
            resultado = primeiro / segundo;
            System.out.println(primeiro + " / " + segundo +  " = " + resultado);
            break;
          default:
            System.out.println("Operação aritimética inválida");
        }
        System.out.println("Deseja realizar outro calculo?\n s = sim\n n = não");
        novamente = ler.next().charAt(0);
      }while(novamente == 's');
    System.out.println("Obrigado volte sempre");
	}
}