package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) {
        try {
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/application/Login.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(this.getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("University Of Gugsi");
            primaryStage.show();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
