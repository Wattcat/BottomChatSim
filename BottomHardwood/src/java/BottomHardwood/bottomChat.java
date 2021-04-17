package BottomHardwood;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class bottomChat extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader();
    FileInputStream fileInputStream = new FileInputStream("src/resource/chat.fxml");
    Parent root = loader.load(fileInputStream);
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    scene.setFill(Color.TRANSPARENT);
    //primaryStage.getIcons().add(new Image("logo.png"));   // Logo
    primaryStage.setTitle("BottomChat V1");
    primaryStage.setResizable(false); // Un-resizable
    primaryStage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }
}
