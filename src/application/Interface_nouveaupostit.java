package application;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.*;

public class Interface_nouveaupostit implements Initializable{
	
	@FXML
	private TextField textfieldtitre;
	@FXML
	private TextArea texareacontenue;
	@FXML
	private Button buttonsauvegarder;
	
	@FXML
	public void handlerSaveButton(){
		
		Stage stage=(Stage)buttonsauvegarder.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
