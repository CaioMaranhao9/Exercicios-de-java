package faccat;
import java.util.Scanner;

public class Ex09Salario {
	public static void main(String[]args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Qual o seu sal�rio total? ");
		float salariototal = sc.nextFloat();
		System.out.println("Porcentual do reajuste: ");
		float porcentagemreajuste = sc.nextFloat();
		float reajuste = (porcentagemreajuste*salariototal)/100;
		float valorfinal = salariototal + reajuste;
		System.out.println("O salario total � de: "+ salariototal+ "\n o reajuste ficar�: "+ reajuste+  "\n o salario total sera: " + valorfinal);
	
	}
}
