package application;

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
	private TextArea textareacontenue;
	@FXML
	private Button buttonsauvegarder;
	public static String titre;
	public static String desc;
	public static int val=0;
	
	@FXML
	public void handlerSaveButton(){
		val=0;
		titre=textfieldtitre.getText();
		desc=textareacontenue.getText();
		val=1;
		Stage stage=(Stage)buttonsauvegarder.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
