
public class Student {
	private String nome;
	private double n1;
	private double n2;
	private double avg = n1 + n2/2;
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public Student(String nome, double n1, double n2) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}
	
}
