package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class MenuController {
	 @FXML
 	public void window1(ActionEvent event) throws Exception {
 		((Node)event.getSource()).getScene().getWindow().hide();
         Stage primaryStage = new Stage();
         FXMLLoader loader = new FXMLLoader();
         Pane root = loader.load(getClass().getResource("Windown1.fxml").openStream());                
         Scene  scene = new Scene(root);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         primaryStage.setScene(scene);
         primaryStage.setTitle("Request Office Move");
         primaryStage.show();
         
        
 	}
 	
 	
 	// Event Listener on Button.onAction
 	@FXML
 	public void window2(ActionEvent event) throws Exception{
     	
     	((Node)event.getSource()).getScene().getWindow().hide();
         Stage primaryStage = new Stage();
         FXMLLoader loader = new FXMLLoader();
         Pane root = loader.load(getClass().getResource("Window2__.fxml").openStream());                
         Scene  scene = new Scene(root);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         primaryStage.setScene(scene);
         primaryStage.setTitle("Change/Delete Office Move");
         primaryStage.show();
 		
 	
 }
 	
 	
 	// Event Listener on Button.onAction
 	@FXML
 	public void window3(ActionEvent event) throws Exception{
     	
     	((Node)event.getSource()).getScene().getWindow().hide();
         Stage primaryStage = new Stage();
         FXMLLoader loader = new FXMLLoader();
         Pane root = loader.load(getClass().getResource("Window3.fxml").openStream());                
         Scene  scene = new Scene(root);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         primaryStage.setScene(scene);
         primaryStage.setTitle("Maintenance Call");
         primaryStage.show();
 		
 	
 }
 	
 	
 	// Event Listener on Button.onAction
 @FXML
 	public void window4(ActionEvent event) throws Exception{
 		
	 ((Node)event.getSource()).getScene().getWindow().hide();
     Stage primaryStage = new Stage();
     FXMLLoader loader = new FXMLLoader();
     Pane root = loader.load(getClass().getResource("Window4_.fxml").openStream());                
     Scene  scene = new Scene(root);
     scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
     primaryStage.setScene(scene);
     primaryStage.setTitle("Building Plans");
     primaryStage.show();
 	
 	
     

 }
 
 @FXML
	public void Signout(ActionEvent event) {
	 try {
  	
  	((Node)event.getSource()).getScene().getWindow().hide();
      Stage primaryStage = new Stage();
      FXMLLoader loader = new FXMLLoader();
      Pane root = loader.load(getClass().getResource("Login.fxml").openStream());                
      Scene  scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("FMO Report Generator");
      primaryStage.show();
	 }catch (Exception e) {
		 
	 }
 	}
 }
	

