package exercicios;
import java.util.Scanner;

public class subtracao{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in); //System.in é para pedir um valor para o usua
		System.out.println("Digite um numero: ");
		int numero01=sc.nextInt();
		System.out.println("Digite outro número: ");
		int numero02=sc.nextInt();
		int subtracao=numero01-numero02;
		System.out.println("O resultado é: "+subtracao);
		sc.close();
	}
}
