package exercicios;
import java.util.Scanner;

public class divisao{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um numero: ");
	float numero01=sc.nextInt();
	System.out.println("Digite outro numero: ");
	float numero02=sc.nextInt();
	float resultado=numero01/numero02;
	System.out.println("O resultado é:"+resultado);
	sc.close();
	}
}	

