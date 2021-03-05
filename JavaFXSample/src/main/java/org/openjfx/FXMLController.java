package org.openjfx;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {
    
    @FXML
    private Button onlyButton;
    
    @FXML
    public void buttonClicked(Event e){
        onlyButton.setText("clicked!");
    }
}