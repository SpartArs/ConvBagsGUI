package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 1615, 830));
        primaryStage.setMaxWidth(1615);
        primaryStage.setMaxHeight(830);
        primaryStage.setMinWidth(1615);
        primaryStage.setMinHeight(830);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
