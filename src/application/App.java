package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.HostServices;

public class App extends Application {
	
	private final HostServices services = this.getHostServices();

	String yahooURL = "http://www.yahoo.com";
	

	@FXML
	private Button wb1; 
	@FXML
	public void OpenUrl(ActionEvent event) {
		wb1.setOnAction((ActionEvent e) -> {
            services.showDocument(yahooURL);
        });}
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Qlink.fxml"));

			Scene scene = new Scene(root,500,400);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("AlgonQuick");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
