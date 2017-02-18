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

	private static String[] urls = new String[]{
	        "http://www.algonquincollege.com",
	        "http://www.algonquincollege.com/careers/career-opportunities/",
	        "http://www.algonquincollege.com/a-z/#news",
	        "http://www.algonquincollege.com/about/",
	        "http://www.algonquincollege.com/future-students/programs/"
	        
	    };
	
	
	@FXML
	private Button wb1; 
	@FXML
	private Button wb2; 
	@FXML
	private Button wb3; 
	@FXML
	private Button wb4; 
	@FXML
	private Button wb5; 
	@FXML
	public void openWeb1(ActionEvent event) {
		wb1.setOnAction((ActionEvent e) -> {
            services.showDocument(urls[0]);
            
        });}
	@FXML
	public void openWeb2(ActionEvent event) {
		wb2.setOnAction((ActionEvent e) -> {
            services.showDocument(urls[1]);
            
        });}
	@FXML
	public void openWeb3(ActionEvent event) {
		wb3.setOnAction((ActionEvent e) -> {
            services.showDocument(urls[2]);
            
        });}
	@FXML
	public void openWeb4(ActionEvent event) {
		wb4.setOnAction((ActionEvent e) -> {
            services.showDocument(urls[3]);
            
        });}
	@FXML
	public void openWeb5(ActionEvent event) {
		wb5.setOnAction((ActionEvent e) -> {
            services.showDocument(urls[4]);
            
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
