package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window3Controller  {
	

	
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Label lbl1;
	@FXML
	private Label lbl3;
	@FXML
	private Label lbl4;
	@FXML
	private TextField txtUN1;
	@FXML
	private TextField txtUN2;
	@FXML
	private TextField txtUN3;
	@FXML
	private TextField txtUN4;

	@FXML
	public void btn1(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Pane root = loader.load(getClass().getResource("Window3_1_1.fxml").openStream());                
        Scene  scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("1");
        primaryStage.show();
       
	}
	
	@FXML
	public void btn2(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Pane root = loader.load(getClass().getResource("Window3_2.fxml").openStream());                
        Scene  scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("1");
        primaryStage.show();
       
	}
	
	@FXML
	public void openOffice(ActionEvent event) throws Exception {
		
		try {

			Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");
			
			String username = this.txtUN3.getText();
			String roomid = this.txtUN4.getText();

			DBCollection collection = db.getCollection("Maintenance_Requests");
			BasicDBObject document = new BasicDBObject();
			document.put("User Name",username );
			document.put("Room ID", roomid);
			document.put("request", "Open the Office");

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    	LocalDateTime now = LocalDateTime.now();
	    	System.out.println(dtf.format(now));
	    	
	    	String x = dtf.format(now);
	    	
	    	document.put("time",x );

			collection.insert(document);
			
			this.lbl3.setText("Done");

		    } catch (MongoException e) {
			e.printStackTrace();
		    }

		  
		
       
	}
	@FXML
	public void cleanCarpet(ActionEvent event) throws Exception {
		
		try {

			Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");
			
			String username = this.txtUN3.getText();
			String roomid = this.txtUN4.getText();

			DBCollection collection = db.getCollection("Maintenance_Requests");
			BasicDBObject document = new BasicDBObject();
			document.put("User Name",username );
			document.put("Room ID", roomid);
			document.put("request", "Clean the Carpets");

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    	LocalDateTime now = LocalDateTime.now();
	    	System.out.println(dtf.format(now));
	    	
	    	String x = dtf.format(now);
	    	
	    	document.put("time",x );

			collection.insert(document);
			
			this.lbl3.setText("Done");

		    } catch (MongoException e) {
			e.printStackTrace();
		    }

		  
		
       
	}
	@FXML
	public void replaceLight(ActionEvent event) throws Exception {
		
		try {

			Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");
			
			String username = this.txtUN3.getText();
			String roomid = this.txtUN4.getText();

			DBCollection collection = db.getCollection("Maintenance_Requests");
			BasicDBObject document = new BasicDBObject();
			document.put("User Name",username );
			document.put("Room ID", roomid);
			document.put("request", "Replace the Lighting");

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    	LocalDateTime now = LocalDateTime.now();
	    	System.out.println(dtf.format(now));
	    	
	    	String x = dtf.format(now);
	    	
	    	document.put("time",x );

			collection.insert(document);
			
			this.lbl3.setText("Done");


		    } catch (MongoException e) {
			e.printStackTrace();
		    }

		  
		
       
	}
	
	@FXML
	public void deleterq(ActionEvent event) throws Exception {
		
		try {

			String username = this.txtUN1.getText();

	    	Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");

			DBCollection collection = db.getCollection("Maintenance_Requests");
			BasicDBObject searchQuery = new BasicDBObject().append("User Name",username);
			collection.remove(searchQuery);
			lbl4.setText("Deleted");

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
	@FXML
	public void Back1(ActionEvent event)  {
		 try {
	  	
	  	((Node)event.getSource()).getScene().getWindow().hide();
	      Stage primaryStage = new Stage();
	      FXMLLoader loader = new FXMLLoader();
	      Pane root = loader.load(getClass().getResource("Window3.fxml").openStream());                
	      Scene  scene = new Scene(root);
	      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	      primaryStage.setScene(scene);
	      primaryStage.setTitle("Maintenance Call");
	      primaryStage.show();
		 }catch (Exception e) {
			 
		 }
	}
	
	
}
