package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;   // Error resolved by changing access path in properties to javaFX/**
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.Parent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,387);
//			scene.FXMLLoader.load(getClass().getResource("Sample.fxml").toExternalForm());
			Parent root = FXMLLoader.load(getClass().getResource("../Sample.fxml"));
			Scene scene = new Scene(root,600,400);
//			scene.FXMLLoader.load(getClass().getResource("sample.fxml"))
			primaryStage.setTitle("Hello world");
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
