package entities;

public class Employer {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employer() {
	}

	public Employer(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void increaseSalary(Double percent) {
		salary += salary * percent / 100.0;
	}
}