package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PrincipalController {
	
	ObservableList<String> choisirMatch1 = FXCollections.observableArrayList("Creteil - Chartres", "Dunkerque - Ivry", "Nimes - Montpellier", "Paris-SG - HBC Nantes", "Tremblay - Toulouse", "Aix-en-Proven. - Chambéry" );
	ObservableList<String> choisirJournee1 = FXCollections.observableArrayList("1e journée", "2e journée", "3e journée", "4e journée", "5e journée", "6e journée" );
	@FXML
	private Button principal;
	@FXML
	private Pane ligue;
	@FXML
	public ChoiceBox<String> choisirMatch;
	@FXML
	public ChoiceBox<String> choisirJournee;

	// Event Listener on Text[#coucouText].onMouseClicked
	@FXML
	public void openMatch(MouseEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("Direct.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 1200, 600);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	
	}
	
	@FXML
	public void openLigue(MouseEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("Ligue.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 600, 400);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		stage.setMaximized(true);
	}
	
	@FXML
	public void openM(MouseEvent event){
		choisirMatch.setDisable(false);
	}
	
	public void openGo(MouseEvent event){
		principal.setDisable(false);
	}


	
	@FXML
	private void initialize(){ 
		choisirMatch.setItems(choisirMatch1);
		choisirJournee.setItems(choisirJournee1);
		choisirMatch.setValue("1");
		}
	
	@FXML
	private void loc(){ 
		choisirMatch.setItems(choisirMatch1);
		choisirJournee.setItems(choisirJournee1);
		choisirMatch.setValue("1");
		}
	

}
