import java.util.Scanner;
//Exercicio 07: Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro 
//desta área para o usuário.
class Main {
public static void main(String[] args){
//Declaração de variáveis
double lado;
double area;
//Fazer a entrada dos dados
Scanner teclado = new Scanner(System.in);
System.out.println("Digite o comprimento de um dos lados do quadrado: ");
  lado = teclado.nextDouble();
//Fazer o calculo
  area = lado * lado * 2;
//Mostrar o resultado pro usuario
    System.out.println("A area total x 2 é equivalente a: " + area);
  
  }
}