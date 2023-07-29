package application;
import javax.swing.JOptionPane;

public class FirstGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Insert your name: ");
		String message = String.format("Hello %s, welcome to the application!", name);
		JOptionPane.showMessageDialog(null, message);
	}

}
