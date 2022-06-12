package com.ipastorl.tablafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Main application.
 *
 * @version 1.0
 * @author Isabel Pastor López
 */
public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(MainApplication.class.getResource("view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 740, 420);
        stage.setTitle("Space X Capsules");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch();
    }
}