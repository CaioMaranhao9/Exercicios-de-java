package exercicios;
import java.util.Scanner;

public class  multiplicacao{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero01=sc.nextInt();
	System.out.println("Digite outro numero: ");
	int numero02=sc.nextInt();	
	int multiplicacao=numero01*numero02;
	System.out.println("o resultado é: "+multiplicacao);
	sc.close(); 
	}
}