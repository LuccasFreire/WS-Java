package entities;

public class Student {
	public double grade1;
	public double grade2;
	public double grade3;
	public String name;
	
public boolean validGrades() {
	if (this.grade1 > 30 || this.grade2 > 35 || this.grade3 > 35) {
			return false;
		}
		else {
			return true;
		}
}
public double finalGrade() {
	return this.grade1 + this.grade2 + this.grade3;
}
public String passNotPass() {
	if (finalGrade() >= 60) {
		return "Pass";
	}
	else {
		return "Failed";
	}
}
public double notPass() {
	return 60 - finalGrade();
}
public String toString() {
//	return "FINAL GRADE: " + String.format("%.2f", finalGrade()) + "PASS"
	if (passNotPass() == "Pass") {
		return "FINAL GRADE: " + String.format("%.2f", finalGrade()) + "\n" + passNotPass();
	}
	else {
		return "FINAL GRADE: " + String.format("%.2f", finalGrade())+ "\n" +  passNotPass() + "\n Missing: " + notPass();
	}
}
}
