package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Interface_MemoManager implements Initializable{
	
	@FXML
	private Stage stage;
	@FXML
	private MenuBar menubar;
	@FXML
	private TextField textfield;
	@FXML
	private TextFlow textflow;
	@FXML
	private VBox vbox;
	@FXML
	private ArrayList<ImageView> imageview;
	@FXML
	private Button buttonNew;
	@FXML
	private Text text;

	@FXML
	public void handlerButtonNew (ActionEvent event){
		text=new Text("test");
		textflow.getChildren().addAll(text);
		textfield.setText("test");
		//textfield.appendText("test");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
