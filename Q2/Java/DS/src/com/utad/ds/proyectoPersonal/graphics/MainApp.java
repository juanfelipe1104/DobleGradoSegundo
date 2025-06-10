package com.utad.ds.proyectoPersonal.graphics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/utad/ds/proyectoPersonal/graphics/MainView.fxml"));
        stage.setScene(new Scene(loader.load(), 800, 600));
        stage.setTitle("Planificador de Viajes");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
