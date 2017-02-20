package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Dummy implements Initializable{
	
	@FXML
	private Button button;
	
	@FXML
	public void handlerButton(ActionEvent event){
		//Stage stage=(Stage)button.getScene().getWindow();
		//stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
