package BottomHardwood;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class message {
    String myString;
    Text formattedBox;
    
    
    public Text getUser(){
        formattedBox = new Text("You: " + myString + "\n");
        formattedBox.setFill(Color.BLUE);
        formattedBox.setFont(Font.font("Helvetica", 15));
        return formattedBox;
    }

    public Text getBot() {
        formattedBox = new Text("Femboy: " + myString + "\n");
        formattedBox.setFill(Color.RED);
        formattedBox.setFont(Font.font("Helvetica", 15));
        return formattedBox;
    }

    public message(String message) {
        myString = message;
    }
}
