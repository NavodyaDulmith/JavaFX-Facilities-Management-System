package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window4Controller {
	@FXML
	public void Ground(ActionEvent event) throws Exception {
		

		 Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("BuildingPlan1.fxml"));
        primaryStage.setTitle("Building Plan 1");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		

	}
	@FXML
	public void floor1(ActionEvent event) throws Exception {
		

		 Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("BuildingPlan2.fxml"));
        primaryStage.setTitle("Building Plan 2");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		

	}
	@FXML
	public void floor2(ActionEvent event) throws Exception {
		

		 Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("BuildingPlan3.fxml"));
        primaryStage.setTitle("Building Plan 3");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		

	}
	@FXML
	public void floor3(ActionEvent event) throws Exception {
		

		 Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("BuildingPlan4.fxml"));
        primaryStage.setTitle("Building Plan 4");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		

	}
	
	@FXML
	public void floor4(ActionEvent event) throws Exception {
		

		 Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("BuildingPlan5.fxml"));
        primaryStage.setTitle("Building Plan 5");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
		

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
