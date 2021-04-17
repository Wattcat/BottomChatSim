package BottomHardwood;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Controller implements Initializable {
    public boolean firstMessage = true;
    @FXML
    private TextField messageBox;
    @FXML
    private Button sendButton;
    @FXML
    private TextFlow outputBox;

    // autostart
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Text t1 = new Text("Start the conversation you dumbnut \n");
        outputBox.getChildren().add(t1);
        
    }

    // exit program
    public void exit(){
        System.exit(0);
    }

    public void randomMizor() {

    }
    
    // this is used to get the message from the messagebox
    public String getMessage() {
        return messageBox.getText();
    }

    
    // this is to "send" the message
    // like a true femboy, you need to start the conversation
    public void sendMessage() {
        
        String messageToSend = getMessage();
        if (messageToSend.isEmpty() == false) {
            message mymessage = new message(messageToSend);
            outputBox.getChildren().add(mymessage.getUser());
            botRespond();
        }
    }

    public void botRespond() {
        if (firstMessage = true) {
            firstMessage = false;
            // int randomWait = new Random().nextInt(2);
            // randomWait++;
            // Thread.sleep(1000*randomWait);
            int[] surrogates = {0xD83E, 0xDD7A}; // bottom emoji
            String alienEmojiString = new String(surrogates, 0, surrogates.length);
            message botMessage = new message("T" + (char) 0xF47D);
            outputBox.getChildren().add(botMessage.getBot());
            System.out.println(alienEmojiString);
            
        } else {
            // int randomWait = new Random().nextInt(2);
            // randomWait++;
            // Thread.sleep(1000*randomWait);
            message botMessage = new message("OwO");
            outputBox.getChildren().add(botMessage.getBot());
        } 
    }
    


    // this is to open the about page while keeping the main window
    public void openAbout(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream("src/resource/about.fxml");
        Parent viewParent = loader.load(fileInputStream);
        Scene viewScene = new Scene(viewParent);
        Stage stage = new Stage();
        stage.setTitle("About");
        stage.setScene(viewScene);
        stage.setResizable(false);
        stage.show();
      }
    
}
