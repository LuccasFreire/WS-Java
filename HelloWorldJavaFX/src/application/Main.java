package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Click me!");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				StackPane root2 = new StackPane();
				System.out.println("Opening The Console! and Hello World");
				Button btn2 = new Button("You just clicked on me!");
				root2.getChildren().add(btn2);
				Scene scene2 = new Scene(root2, 350, 350);
				primaryStage.setScene(scene2);
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 350, 350);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
