package projectAbbreviation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {


    @Override
    public void start(final Stage stage) throws Exception {

        final Parent root = FXMLLoader.load(ClassLoader.getSystemResource("layouts/Loading.fxml"));
        stage.setTitle("Application Title");
        stage.setScene(new Scene(root));
        // stage.initStyle(StageStyle.TRANSPARENT);
        stage.getIcons().add(new Image(ClassLoader.getSystemResource("relative path to icon").toExternalForm()));
        // stage.setResizable(false);

        stage.show();
    }

    public static void main(final String[] args) {
        launch(args);
    }

}
