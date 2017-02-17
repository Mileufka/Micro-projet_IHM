package application;

import memo.Memo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
	private MenuItem menubarnew;
	@FXML
	private MenuItem menubarclose;
	@FXML
	private MenuItem menubarabout;
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
	private Label labeltitre;
	@FXML
	public static Label labeldesc;
	@FXML
	private Button buttonNew;
	//private ArrayList<Memo> listMemo;
	public static HashMap<Integer,Memo> mapMemo = new HashMap<Integer,Memo>();
	private HashMap<Integer,String> mapMemo2 = new HashMap<Integer,String>();
	
	public static int idvbox =0;
	private Date date;
	private String datestr;
	private ArrayList<String> array =new ArrayList<String>();

	@FXML
	public void handlerButtonNew (ActionEvent event) throws FileNotFoundException{
		date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
		datestr=sdf.format(date);
		Stage dialogNew=new Stage();
		Parent root=null;
		/*
		Thread thr=new Thread(){
			public void run() {
				while(Interface_nouveaupostit.val==0);
				notify();
			}
		};
		*/
		
		
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
		
		
		
		vbox=new VBox();
		labeltitre=new Label();
		labeldesc=new Label();
		vbox.setId(""+idvbox);
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
					
					int i = Integer.parseInt(vbox.getId());
					
						tilepane.getChildren().remove(i-1);
					
					
				}
			}
		});
		
		labeltitre.setText(datestr + " : " + Interface_nouveaupostit.titre);
		labeldesc.setText(Interface_nouveaupostit.desc);
		vbox.getChildren().add(imageview);
		vbox.getChildren().add(labeltitre);
		vbox.getChildren().add(labeldesc);
		tilepane.getChildren().add(vbox);
		
		mapMemo.put(idvbox,new Memo(Interface_nouveaupostit.titre,labeldesc.getText()));
		mapMemo.get(idvbox).affiche();
		/*
		String[] tt = new String[3]; 
		tt[0]=labeltitre.getText();
		tt[1]=labeldesc.getText();
		tt[2]=datestr;
		
		
		mapMemo2.put(idvbox,tt[0]);
		
		if(idvbox == 2)
		{
			System.out.println(mapMemo2.get(idvbox));
		}
		
		//array.add(labeltitre.getText());
		//array.add(labeldesc.getText());
		//array.add(datestr);
		
		//System.out.println(mapMemo2.get(2));
		*/
		idvbox++;
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
	
	public void handlerClose(){
		Stage stage=(Stage)menubar.getScene().getWindow();
		stage.close();
	}
	
	public void handlerAbout(){
		Stage dialogAbout=new Stage();
		Parent root=null;
		try {
			root = FXMLLoader.load(getClass().getResource("interface_about.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		dialogAbout.setTitle("Memo");
		dialogAbout.setScene(scene);
		dialogAbout.show();
	}
	
	
	public void handlerHistorique(){
		Stage dialogHistorique=new Stage();
		Parent root=null;
		try {
			root = FXMLLoader.load(getClass().getResource("interface_historique.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		dialogHistorique.setTitle("Historique");
		dialogHistorique.setScene(scene);
		dialogHistorique.show();
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		scrollbar.valueProperty().addListener((ObservableValue<? extends Number> ov,Number old_val, Number new_val) -> {
			tilepane.setLayoutY(new_val.doubleValue());
		});
		
	}

}
