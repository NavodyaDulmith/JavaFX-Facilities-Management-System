package application;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.bson.Document;
import org.bson.conversions.Bson;

public class MainController {
    @FXML
    private Label lblStatus;
    @FXML 
    public TextField txtUserName;
    @FXML
    private TextField txtPassword;

    


	public void Login(ActionEvent event) throws Exception {
        String Username = this.txtUserName.getText();
        String Password = this.txtPassword.getText();
        MongoClient mongo = new MongoClient("localhost", 27017);
        MongoDatabase database = mongo.getDatabase("ndw");
        MongoCollection<Document> collection = database.getCollection("user");
        System.out.println("Database Selected Successfully");

        try {
            Document myDocument = (Document)collection.find(Filters.and(new Bson[]{Filters.eq("username", Username), Filters.eq("password", Password)})).first();
            String username = myDocument.getString("username");
            String password = myDocument.getString("password");
            
            if (username == myDocument.getString("username") && password == myDocument.get("password")) {
                this.lblStatus.setText("LogIn Success");
                 
                
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage primaryStage = new Stage();
                FXMLLoader loader = new FXMLLoader();
                Pane root = loader.load(getClass().getResource("Menu.fxml").openStream());                 
                Scene  scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
                primaryStage.setScene(scene);
                primaryStage.setTitle("Menu");
                primaryStage.show();
               
                
            }
        } catch (NullPointerException var10) {
            this.lblStatus.setText("LogIn Failed");
            
        }
    }
    
    
    	 
}
