package entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num,n2;
		double ndouble;
		String x,y,z;
		char posicao;
		
		System.out.print("Digite seu nome: ");
		x = teclado.next();
		
		
		System.out.print("Digite um numero: ");
		num = teclado.nextInt();
		
		System.out.print("Digite um numero double: ");
		ndouble = teclado.nextDouble();
		
		System.out.print("Digite uma letra: ");
		posicao = teclado.next().charAt(0);
		
		n2 = teclado.nextInt();
		teclado.nextLine();
		z = teclado.nextLine();
		y = teclado.nextLine();
		
		System.out.println("Foi digitado: "+ x);
		System.out.println("Foi digitado o numero: "+ num);
		System.out.println("Foi digitado o numero double: "+ ndouble);
		System.out.println("Primeira letra: "+ posicao);
		
		teclado.close();
	}

}
