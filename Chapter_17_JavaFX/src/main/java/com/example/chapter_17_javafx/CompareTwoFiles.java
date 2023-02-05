package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareTwoFiles extends Application {

    Label pathAsk;
    Label status;
    Label error = new Label("Путь к одному из файлов не найден!");
    TextField path1 = new TextField();
    TextField path2 = new TextField();
    Button btnCompare;
    Popup popup = new Popup();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) throws Exception {

        myStage.setTitle("Демонстрация сравнения двух файлов");

        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 300);

        myStage.setScene(myScene);

        pathAsk = new Label("Введите полный путь к двум файлам");
        status = new Label("Пока ничего не сравнивалось");

        path1.setPromptText("Введите путь к файлу №1");
        path2.setPromptText("Введите путь к файлу №2");

        Separator separator = new Separator();
        separator.setPrefWidth(180);

        btnCompare = new Button("Сравнить файлы");

        path1.setOnAction( ae -> {
            if (!path1.getText().equals("") && !path2.getText().equals(""))
                btnCompare.fire();
        });

        path2.setOnAction( ae -> {
            if (!path1.getText().equals("") && !path2.getText().equals(""))
                btnCompare.fire();
        });

        btnCompare.setOnAction( ae -> {
            if ( compareFiles(path1.getText(), path2.getText(), myStage) )
                status.setText("Файлы идентичны!");
            else
                status.setText("Файлы отличаются!");
        });

        rootNode.getChildren().addAll(pathAsk, path1, path2, separator, btnCompare, status);

        myStage.show();
    }

    boolean compareFiles(String filepath1, String filepath2, Stage s1) {

        int i, j;
        try (FileInputStream f1 = new FileInputStream(filepath1);
             FileInputStream f2 = new FileInputStream(filepath2)) {
            System.out.println(filepath1 + " " + filepath2);
            do {
                i = f1.read();
                j = f2.read();
            } while(i == j && i != -1);
            return (i == j);
        } catch (IOException exc) {
            // Работает кривовато
            if (!popup.isShowing()) {
                popup.getContent().add(error);
                popup.show(s1);
            }
            return false;
        }
    }
}
