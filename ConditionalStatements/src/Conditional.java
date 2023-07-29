import java.util.Scanner;
public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		int x = 5;
		int hora;
		
		System.out.println("Que horas sao? ");
		hora = kb.nextInt();
		
		//CONDICIONAL SIMPLES
		if (x > 5) {
			System.out.println("Boa");
		}
		
		//CONDICIONAL COMPOSTA
		if (hora < 12) {
			System.out.println("Esta de manha");
		}
		else {
			System.out.println("Esta de tarde");
		}
		//CONDICIONAO ENCADEADA
		if (hora < 12) {
			System.out.println("Esta de manha");
		}
		else if (hora < 18) {
			System.out.println("Esta de tarde");
		} 
		else {
			System.out.println("Esta de noite");
		}
		kb.close();
		
	}	

}
