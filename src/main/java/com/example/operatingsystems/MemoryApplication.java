package com.example.operatingsystems;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MemoryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OperationsApplication.class.getResource("fixed-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 660, 470);
        stage.setTitle("Memory Job Algorithms");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
