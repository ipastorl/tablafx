package com.ipastorl.tablafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// Task :run FAILED
// file:/C:/Users/issa2/OneDrive/Documentos/DAW/PROGRAMACION/tablafx/build/resources/main/com/ipastorl/tablafx/view.fxml
// ruta absoluta
// C:\Users\issa2\OneDrive\Documentos\DAW\PROGRAMACION\tablafx\src\main\resources\com\ipastorl\tablafx/view.fxml

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

    public static void main(String[] args) {
        launch();
    }
}