package com.javafxapplicationtest.gui.mainboot;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;


public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var scene = new Scene(loadFxml("MainApplicationFile"), 640, 480);

        stage.setTitle("Приложение для изменения информации о компьютерах");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public Parent loadFxml(String fxml) throws IOException{
        FXMLLoader fxmlloader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlloader.load();
    }

}
