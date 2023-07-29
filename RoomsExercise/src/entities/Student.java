package entities;

public class Student {
	private double rent;
	private String name;
	private String email;
	private int chosenRoom;
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public Student(String name, String email, int chosenRoom) {
		super();
		this.name = name;
		this.email = email;
		this.chosenRoom = chosenRoom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getChosenRoom() {
		return chosenRoom;
	}
	public void setChosenRoom(int chosenRoom) {
		this.chosenRoom = chosenRoom;
	}
}
