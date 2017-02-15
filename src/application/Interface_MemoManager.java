package application;

import memo.Memo;

import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class Interface_MemoManager implements Initializable{
	
	@FXML
	private Stage stage;
	@FXML
	private MenuBar menubar;
	@FXML
	private TilePane tilepane;
	@FXML
	private ScrollBar scrollbar;
	@FXML
	private VBox vbox;
	//@FXML
	//private ArrayList<ImageView> imageview;
	@FXML
	private ImageView imageview;
	@FXML
	private Button buttonNew;
	private ArrayList<Memo> listMemo;
	public static String idOrigin;

	@FXML
	public void handlerButtonNew (ActionEvent event) throws FileNotFoundException{
		Stage dialogNew=new Stage();
		Parent root=null;
		
		imageview=new ImageView(new Image(new FileInputStream("/home/clement/workspace/Micro-projet_IHM/ressources/post-it.png")));
		imageview.setOnMouseClicked(new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				Stage dialogModif=new Stage();
				Parent root=null;
				try {
					root = FXMLLoader.load(getClass().getResource("interface_modifier.fxml"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Scene scene = new Scene(root);
				dialogModif.setTitle("Modification Post-it");
				dialogModif.setScene(scene);
				dialogModif.show();
				
				if(Interface_modifier.val==2){
					tilepane.getChildren().removeAll(imageview);
				}
			}
		});

		tilepane.getChildren().add(imageview);
		
		try {
			root = FXMLLoader.load(getClass().getResource("interface_nouveaupostit.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		dialogNew.setTitle("Nouveau Post-it");
		dialogNew.setScene(scene);
		dialogNew.show();
	}
	
	public void handlerScrollBar (ActionEvent event){
		/*
		scrollbar.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    tilepane.setLayoutY(-new_val.doubleValue());
            }
        });
        */
		/*
		scrollbar.valueProperty().addListener((ObservableValue<? extends Number> ov,Number old_val, Number new_val) -> {
					tilepane.setLayoutY(new_val.doubleValue());
            });
		*/
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		scrollbar.valueProperty().addListener((ObservableValue<? extends Number> ov,Number old_val, Number new_val) -> {
			tilepane.setLayoutY(new_val.doubleValue());
		});
		
	}

}
