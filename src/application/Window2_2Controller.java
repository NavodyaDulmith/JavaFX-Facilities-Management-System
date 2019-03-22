package application;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

public class Window2_2Controller {
	@FXML
	private TextField txtuser;
	@FXML
	private Label lbl1;
	
	@FXML
	public void Delete(ActionEvent event) throws Exception {
    	
    	
		try {
			String username = this.txtuser.getText();

	    	Mongo mongo = new Mongo("localhost", 27017);
			DB db = mongo.getDB("ndw");

			DBCollection collection = db.getCollection("Office_Moves");
			BasicDBObject searchQuery = new BasicDBObject().append("User Name",username);
			collection.remove(searchQuery);
			lbl1.setText("Deleted");

		} catch (MongoException e) {
			e.printStackTrace();
		    }

	}

}
