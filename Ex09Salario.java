package faccat;
import java.util.Scanner;

public class Ex09Salario {
	public static void main(String[]args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Qual o seu salário total? ");
		float salariototal = sc.nextFloat();
		System.out.println("Porcentual do reajuste: ");
		float porcentagemreajuste = sc.nextFloat();
		float reajuste = (porcentagemreajuste*salariototal)/100;
		float valorfinal = salariototal + reajuste;
		System.out.println("O salario total é de: "+ salariototal+ "\n o reajuste ficará: "+ reajuste+  "\n o salario total sera: " + valorfinal);
	
	}
}
