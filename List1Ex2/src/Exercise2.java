import java.util.Scanner;
import java.util.Locale;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faca um programa para ler o valor do raio de um circulo, e depois mostrar o valor da area deste circulo com quatro
        casas decimais conforme exemplos.
		  Formula da area: area = pi . raio2
		  Considere o valor de pi = 3.14159*/
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);
		double pi = 3.14159;
		double raio;
		
		
		System.out.println("CALCULATE THE AREA OF A CIRCLE");
		System.out.print("Type the radius value: ");
		raio = kb.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area value: %.4f", area);
		
		kb.close();
	}

}
