import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faca um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses numeros com uma
		mensagem explicativa, conforme exemplos */
		Scanner kb = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.print("Type the first number ");
		n1 = kb.nextInt();
		
		System.out.print("Type the second number ");
		n2 = kb.nextInt();
		
		soma = n1 + n2;
		System.out.println("The sum of "+ n1 + " and "+ n2 +" equals: " + soma);
		
		kb.close();
	}

}
