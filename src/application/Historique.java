package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Historique implements Initializable{

	private VBox vbox;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Label labelpostit;
		String datapostit;
		
		for (int i=0;i<Interface_MemoManager.idvbox; i++){
		datapostit = new String(Interface_MemoManager.mapMemo.get(i).toString());
		labelpostit = new Label(datapostit);
		
		vbox.getChildren().add(labelpostit);
		}
		
		
	}

}
