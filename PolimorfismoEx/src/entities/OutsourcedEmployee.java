package entities;

public class OutsourcedEmployee extends Employee{
	private Double addCharge;

	public OutsourcedEmployee(String name, Integer hours, Float valuePerHour, Double addCharge) {
		super(name, hours, valuePerHour);
		this.addCharge = addCharge;
	}
	public OutsourcedEmployee() {
	}
	public Double getAddCharge() {
		return addCharge;
	}
	public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addCharge * 1.1;
	}
	
}
