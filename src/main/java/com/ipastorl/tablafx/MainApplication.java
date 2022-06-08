package com.ipastorl.tablafx;

import com.ipastorl.tablafx.model.CapsulesApiService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 740, 420);
        stage.setTitle("Space X Capsules");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Retrofit Builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CapsulesApiService service = retrofit.create(CapsulesApiService.class);
        launch();
    }
}