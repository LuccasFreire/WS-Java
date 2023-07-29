import java.util.Scanner;
import java.util.Locale;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa que leia o numero de um funcionario, seu numero de horas trabalhadas, o valor que recebe por
hora e calcular o salario desse funcionario. A seguir, mostre o numero e o salario do funcionario, com duas casas
decimais*/
		Locale.setDefault(Locale.US);
		int code;
		double perHour, salary, workHours;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Digite o seu codigo de funcionario: ");
		code = kb.nextInt();
		
		System.out.print("Digite o valor que tu recebe por hora: ");
		perHour = kb.nextDouble();
		
		System.out.print("Digite quantas horas tu trabalha: ");
		workHours = kb.nextDouble();
		
		salary = perHour * workHours;
		
		System.out.printf("Codigo do Funcionario: %d%nSeu salario: %.2f", code, salary);
		
		kb.close();
	}

}
