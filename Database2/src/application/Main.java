package application;
	
import entities.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			root.setPadding(new Insets(20));
			root.setHgap(25);
			root.setVgap(15);
			Label title = new Label("Enter the data: ");
			
		    root.add(title, 0, 0, 2, 1);

			Label userName = new Label("Username: ");
			TextField txtfUser = new TextField();
			Label password = new Label("Password: ");
			PasswordField txtfPass = new PasswordField();
			Label email = new Label("Email: ");
			TextField txtfEmail = new TextField();
			Label phone = new Label("Phone: ");
			TextField txtfPhone = new TextField();
			Button submit = new Button("Submit");
			
			GridPane.setHalignment(userName, HPos.LEFT);
		    root.add(userName, 0, 1);
		    GridPane.setHalignment(userName, HPos.RIGHT);
		    root.add(txtfUser, 1, 1);
		    
		    GridPane.setHalignment(password, HPos.LEFT);
			root.add(password, 0, 2);
			GridPane.setHalignment(txtfPass, HPos.RIGHT);
			root.add(txtfPass, 1, 2);
			
			GridPane.setHalignment(email, HPos.LEFT);
			root.add(email, 0, 3);
			GridPane.setHalignment(txtfEmail, HPos.RIGHT);
			root.add(txtfEmail, 1, 3);
			
			GridPane.setHalignment(phone, HPos.LEFT);
			root.add(phone, 0, 4);
			GridPane.setHalignment(txtfPhone, HPos.RIGHT);
			root.add(txtfPhone, 1, 4);
			
			GridPane.setHalignment(submit, HPos.RIGHT);
			root.add(submit, 1, 5);
			
			
			
			submit.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					String name = txtfUser.getText();
					String passw = txtfPass.getText();
					String temail = txtfEmail.getText();
					String tphone = txtfPhone.getText();
					User usuario = new User(name, passw, temail, tphone);
					DatabaseDAO dbDao = new DatabaseDAO();
					String result = dbDao.insert(usuario);
					Label lresult = new Label(result);
					root.add(lresult, 1, 6);
				}
			});
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
