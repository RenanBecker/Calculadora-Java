import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {
  public static void main(String[] args){
    double primeiro;
    double segundo;
    double resultado;
    char novamente = 'a';
    char operacao = 'a';

    System.out.println("Bem vindo ao programa Calculadora");
    do {
      Scanner ler = new Scanner(System.in);
      while(true){
        System.out.println("Digite o primeiro número da operação");
        try{
        primeiro = ler.nextDouble();
        break;
        } catch (Exception e) {
          System.out.print("Por favor digite apenas números\n");
          ler.nextLine();
        }
      }
      while((operacao != '+') && (operacao != '-') && (operacao != '*') && (operacao != '/')){
        System.out.println(
            "Escolha a operação que deseja realizar\n+ para somar\n- para subtrair\n* para multiplicar\n/ para dividir");
        operacao = ler.next().charAt(0);
          if((operacao != '+') && (operacao != '-') && (operacao != '*') && (operacao != '/')){
            System.out.print("\033[H\033[2J"); 
            System.out.println("Escolha invalida");
          }
      }
      while(true){
        System.out.println("Digite o segundo número da operação");
        try{
        segundo = ler.nextDouble();
        break;
        } catch (Exception e) {
          System.out.print("Por favor digite apenas números\n");
          ler.nextLine();
        }
      }
      switch (operacao) {
        case '+':
          resultado = primeiro + segundo;
          System.out.println(primeiro + " + " + segundo + " = " + resultado);
          break;
        case '-':
          resultado = primeiro - segundo;
          System.out.println(primeiro + " - " + segundo + " = " + resultado);
          break;
        case '*':
          resultado = primeiro * segundo;
          System.out.println(primeiro + " * " + segundo + " = " + resultado);
          break;
        case '/':
          resultado = primeiro / segundo;
          System.out.println(primeiro + " / " + segundo + " = " + resultado);
          break;
      }
      System.out.println("Deseja realizar outro calculo?\n s = sim\n n = não");
      novamente = ler.next().charAt(0);
      operacao = 'a';
      System.out.print("\033[H\033[2J"); 
    } while (novamente == 's');
    System.out.println("Obrigado volte sempre");
  }
}