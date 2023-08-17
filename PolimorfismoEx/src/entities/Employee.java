package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Float valuePerHour;
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	public Employee() {
	}
	public Employee(String name, Integer hours, Float valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Float getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Float valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	
	
}
