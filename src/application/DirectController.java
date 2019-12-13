package application;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
	
	
	
}
