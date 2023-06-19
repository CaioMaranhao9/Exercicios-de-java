package Manzano;
import java.util.Scanner;

public class Ex07CelciusEmFahrenheit{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Informe os graus em Celcius: ");
			float celcius = sc.nextFloat();
			float fahrenheit = ((9 * celcius)+160)/5;
			System.out.println("A conversão será: "+fahrenheit);
			sc.close();
		}
	}

