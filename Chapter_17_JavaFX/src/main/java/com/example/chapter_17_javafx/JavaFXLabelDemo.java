package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class JavaFXLabelDemo extends Application {



    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Демонстрация работы Label (метки)");

        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene(rootNode, 300, 200);

        myStage.setScene(myScene);

        Label myLabel = new Label("JavaFX - это мощный GUI");

        rootNode.getChildren().add(myLabel);

        myStage.show();
    }
}
