package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MiniApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
    	Parent root = FXMLLoader.load(this.getClass().getResource("/fxml/mini.fxml"));
    	Scene scene = new Scene( root );
        stage.setTitle("Personaliza tu Mini Cooper");
    	stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/533/533864.png"));
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
		launch(args);
	}
}
