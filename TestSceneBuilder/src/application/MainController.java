package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label number; 
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
			int randomNum = rand.nextInt(50) + 1;
			number.setText(Integer.toString(randomNum));
	}
}
