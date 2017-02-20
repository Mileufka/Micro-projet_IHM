package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Parent root=null;
		//ScrollBar scrollbar=new ScrollBar();
		try {
			root = FXMLLoader.load(getClass().getResource("interface_MemoManager.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		primaryStage.setTitle("Memo");
		primaryStage.setScene(scene);
		
		
		/*
		scrollbar.valueProperty().addListener((ObservableValue<? extends Number> ov,Number old_val, Number new_val) -> {
			tilepane.setLayoutY(new_val.doubleValue());
		});
		*/
		primaryStage.show();
		/*
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
