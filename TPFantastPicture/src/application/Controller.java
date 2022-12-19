package application;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import entite.ImageA;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import service.Modele;

public class Controller implements Initializable{
	
	private Modele modele;
	
	@FXML
	private Button btnValiderPersonne;
	
	@FXML
	private Button btnValiderNote;
	
	@FXML
	private TextField txtNomPersonne;
	
	@FXML
	private TextField txtMdpPersonne;
	
	@FXML
	private TextField txtValeurNote;
	
	@FXML
	private ImageView imageView;
	
	@FXML
	private ListView listNomImage;
	
	
	public void initialize(URL arg0, ResourceBundle arg1 ) {
		init();
	}
	
	
	private ObservableList<String> items = FXCollections.observableArrayList();


	private void init() {
		this.modele = new Modele();
		
		HashMap<String, ImageA> listImage = this.modele.getDictImage();
        listNomImage.setItems(items);
        items.addAll(listImage.keySet());
		
	}
	
	public void OnClickListView() {
		
		String nom = (String) listNomImage.getSelectionModel().getSelectedItem();
		imageView.setImage(this.modele.getImageVille(nom));

	}
	
	public void OnClickButtonValiderPersonne() {
		String nom = txtNomPersonne.getText();
		txtValeurNote.setText(nom);
	}
	
	
	
}
