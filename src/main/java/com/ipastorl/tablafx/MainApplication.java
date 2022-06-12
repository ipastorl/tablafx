package com.ipastorl.tablafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Main application.
 *
 * @version 1.0
 * @author Isabel Pastor López
 */
public class MainApplication extends Application {

    /**
     * Stage load, set icon, title, scene and show it
     *
     * @param stage Stage
     * @throws IOException IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 740, 420);
        // set icon from isabelpastorlopez.com
        stage.getIcons().add(new Image("https://isabelpastorlopez.com/img/icono.png"));
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