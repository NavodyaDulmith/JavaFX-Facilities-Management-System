package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import javafx.event.ActionEvent;

public class Window1_Controller {
	

	@FXML
    private TextField txtuserName;
    @FXML 
    private TextField txtID;
    @FXML
    private TextField txtLocation;
    
    
	
    @FXML
	public void AddRq(ActionEvent event) throws Exception {
    	
    	
		try {
			String username = this.txtuserName.getText();
	    	String id = this.txtID.getText();
	    	
	    	String location = this.txtLocation.getText();
	    	
	    	Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");

			DBCollection collection = db.getCollection("Office_Moves");
			
			BasicDBObject document = new BasicDBObject();
			document.put("User Name", username);
			document.put("Furniture ID", id);
			document.put("Location", location);
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    	LocalDateTime now = LocalDateTime.now();	    	
	    	String x = dtf.format(now);
	    	
	    	document.put("time",x );

			collection.insert(document);

		    } catch (MongoException e) {
			e.printStackTrace();
		    }

	}

	
	
	
	
	
	
	@FXML
	public void Back(ActionEvent event)  {
		 try {
	  	
	  	((Node)event.getSource()).getScene().getWindow().hide();
	      Stage primaryStage = new Stage();
	      FXMLLoader loader = new FXMLLoader();
	      Pane root = loader.load(getClass().getResource("Menu.fxml").openStream());                
	      Scene  scene = new Scene(root);
	      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	      primaryStage.setScene(scene);
	      primaryStage.setTitle("Menu");
	      primaryStage.show();
		 }catch (Exception e) {
			 
		 }
	}
}
