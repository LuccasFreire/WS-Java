package entities;

public class Employee {
	public double salary;
	public String name;
	public double tax;
	
	public String toString() {
		return "Updated data: " + name + ", " + "$ " + String.format("%.2f", salary); 
	}
	
	public double netSalary() {
		return this.salary -= tax;
	}
	public void increaseSalary(double porcent) {
		salary = ((salary * porcent)/100) + salary;
	}
}
