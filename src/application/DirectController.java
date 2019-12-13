package application;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DirectController {
	@FXML
	private Text secondes;
	@FXML
	private Text minutes;
	@FXML
	private ImageView startC, stopC; 
	int seconde=0, minute=0;
	@FXML
	private Button minB,bleu, jaune, rouge, annulTirG, annulTirD, arret, but, rate;
	@FXML
	private Pane selectionTir, tirLoc, affichageTir, selectionCarton, annulG, annulD, selectionMin;
	@FXML
	private RadioButton tireur1, tireur2, tireur3, tireur4, tireur5, tireur6, tireur7, tireur11, tireur21, tireur31, tireur41, tireur51, tireur61, tireur71,  tireur111, tireur211, tireur311, tireur411, tireur511, tireur611, tireur711;
	
	
	private ScheduledExecutorService chronoJm = Executors.newSingleThreadScheduledExecutor();
	
	@FXML
	public void startCh(MouseEvent event){
		
	chronoJm = Executors.newSingleThreadScheduledExecutor();
	chronoJm.scheduleAtFixedRate(chronoRun,1000,1000,TimeUnit.MILLISECONDS);
	}
	@FXML
	final Runnable chronoRun = new Runnable() {
		public void run() {
			if(seconde<9) {
			seconde++;
			secondes.setText("0"+Integer.toString(seconde));
			}
			else if(seconde<59) {
				seconde++;
			
				secondes.setText(Integer.toString(seconde));
			}
			else if (minute<9){
				seconde=0;
				minute++;
				secondes.setText("0"+Integer.toString(seconde));
				minutes.setText("0"+Integer.toString(minute));
			}
			else {
				
				seconde=0;
				minute++;
				secondes.setText("0"+Integer.toString(seconde));
				minutes.setText(Integer.toString(minute));
			}
			
		}
	};

	@FXML
	public void tirG(MouseEvent event){
		annulTirG.setVisible(true);
		selectionTir.setVisible(true);

	}
	
	
	public void deselection(){
		tireur1.setSelected(false);
		tireur2.setSelected(false);
		tireur3.setSelected(false);
		tireur4.setSelected(false);
		tireur5.setSelected(false);
		tireur6.setSelected(false);
		tireur7.setSelected(false);
		tireur11.setSelected(false);
		tireur21.setSelected(false);
		tireur31.setSelected(false);
		tireur41.setSelected(false);
		tireur51.setSelected(false);
		tireur61.setSelected(false);
		tireur71.setSelected(false);
		tireur111.setSelected(false);
		tireur211.setSelected(false);
		tireur311.setSelected(false);
		tireur411.setSelected(false);
		tireur511.setSelected(false);
		tireur611.setSelected(false);
		tireur711.setSelected(false);

	}
	
	@FXML
	public void tirD(MouseEvent event){
		annulTirD.setVisible(true);
		selectionTir.setVisible(true);

	}
	
	@FXML
	public void annulTir(MouseEvent event){
		annulTirD.setVisible(false);
		annulTirG.setVisible(false);
		selectionTir.setVisible(false);
		tirLoc.setVisible(false);
		affichageTir.setVisible(false);
		arret.setDisable(true);
		but.setDisable(true);
		rate.setDisable(true);
		bleu.setDisable(true);
		jaune.setDisable(true);
		rouge.setDisable(true);
		deselection();
		selectionMin.setVisible(false);
		selectionCarton.setVisible(false);
	}
	
	
	@FXML
	public void cartonG(MouseEvent event){
		selectionCarton.setVisible(true);
		annulTirG.setVisible(true);
	}
	@FXML
	public void cartonD(MouseEvent event){
		selectionCarton.setVisible(true);
		annulTirD.setVisible(true);
	}
	
	@FXML
	public void minG(MouseEvent event){
		selectionMin.setVisible(true);
		annulTirG.setVisible(true);
	}
	
	@FXML
	public void minD(MouseEvent event){
		selectionMin.setVisible(true);
		annulTirD.setVisible(true);
	}
	
	@FXML
	public void locTir(MouseEvent event){
		affichageTir.setVisible(true);
		selectionTir.setVisible(false);
		tirLoc.setVisible(false);
		deselection();
	}
	
	@FXML
	private void locTirCage(){ 
		tirLoc.setVisible(true);
		selectionTir.setVisible(false);
		affichageTir.setVisible(false);
		deselection();
		}
	
	@FXML
	private void deveTir(){ 
		arret.setDisable(false);
		but.setDisable(false);
		rate.setDisable(false);
		}
	
	@FXML
	private void deveMin(){ 
		minB.setDisable(false);
		}
	
	@FXML
	private void deveCart(){ 
		bleu.setDisable(false);
		rouge.setDisable(false);
		jaune.setDisable(false);
	}
	
	@FXML
	private void cartonExec(){ 
		selectionCarton.setVisible(false);
		annulTirD.setVisible(false);
		annulTirG.setVisible(false);
		bleu.setDisable(true);
		jaune.setDisable(true);
		rouge.setDisable(true);
		deselection();
	}
	
	@FXML
	private void minutes(){ 
		minB.setDisable(true);
		annulTirD.setVisible(false);
		annulTirG.setVisible(false);
		selectionMin.setVisible(false);
		deselection();
	}
}
