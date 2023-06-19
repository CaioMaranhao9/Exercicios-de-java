package faccat;
import java.util.Scanner;

public class ex07Idade {
	public static void main(String[]args){
		Scanner sc =new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		int anos = sc.nextInt();
		System.out.println("Digite quantos meses faz do seu ultimo aniversario: ");
		int meses = sc.nextInt();
		System.out.println("E digite o restante dos dias que passaram: ");
		int dias = sc.nextInt();
		int resultadoanos = anos*365;
		int resultadomeses = meses*30;
		int resultadodias = resultadoanos+resultadomeses+dias;
		System.out.println("Voce tem "+resultadodias+" dias de vida ");
		
		sc.close();
	}
}
