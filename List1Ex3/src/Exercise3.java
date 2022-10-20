import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferenca do produto
		 de A e B pelo produto de C e D segundo a formula: DIFERENCA = (A * B - C * D).*/
		
		int n1,n2,n3,n4;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		n1 = kb.nextInt();
		System.out.print("Digite o valor B: ");
		n2 = kb.nextInt();
		System.out.print("Digite o valor C: ");
		n3 = kb.nextInt();
		System.out.print("Digite o valor D: ");
		n4 = kb.nextInt();
		
		int formula = n1 * n2 - n3 * n4;
		
		System.out.println(formula);
		kb.close();
	}
}