package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Interface_modifier implements Initializable{
	
	@FXML
	private Button buttonenregistrer;
	@FXML
	private Button buttonsupprimer;
	@FXML
	private TextArea textareaaffichage;
	@FXML
	private TextArea textareamodifier;
	public static int val=0;
	public static String affiche;
	
	public void affichagetext(){
		affiche = Interface_MemoManager.labeldesc.getParent().getId();
		textareaaffichage.setText(affiche);
	}
	
	public void handlerButtonSave(ActionEvent event){
		val=1;
		//textareaaffichage.setText(Interface_MemoManager.this.);
		Stage stage=(Stage)buttonenregistrer.getScene().getWindow();
		stage.close();
	}
	
	public void handlerButtonDel(ActionEvent event){
		val=2;
		Stage stage=(Stage)buttonsupprimer.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
