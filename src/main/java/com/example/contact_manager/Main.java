package com.example.contact_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/contact_manager/contact-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        scene.getStylesheets().add(String.valueOf(getClass().getResource("/com/example/contact_manager/contact-style.css")));


        stage.setTitle("Contact Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
