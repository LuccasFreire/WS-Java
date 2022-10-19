import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.5234;
		int idade = 31;
		String nome = "Lucas";
		double renda = 5.000;
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("Resultado "+ y+" Resultado");
		System.out.printf("Resultado %.2f metros%n", x);
		System.out.printf("%s tem um salario de %.3f e possui idade de %d", nome, renda, idade);
	}

}
