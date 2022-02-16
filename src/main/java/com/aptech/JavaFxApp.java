package com.aptech;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxApp extends Application {

    public void start(Stage stage) throws Exception {
//        StackPane root=new StackPane();
//        Button btn=new Button("Button");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.exit(0);
//                System.out.println("testing event action");
//            }
//        });

//        root.getChildren().add(btn);
        Parent root= FXMLLoader.load(getClass().getResource("/table.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFX");
        stage.setResizable(true);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
