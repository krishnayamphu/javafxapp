package com.aptech;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class TestController {
    private String text;
    @FXML
    private Button btnhello;
    @FXML
    private Button btntest;

    @FXML
    private void initialize()
    {
        text="Hello World";
        btntest.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Testing...");
            }
        });
//
    }
    @FXML
    void sayHello(ActionEvent event) {
        System.out.println(text);
    }

}
