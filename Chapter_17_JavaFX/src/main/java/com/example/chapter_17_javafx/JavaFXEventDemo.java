package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {

    // Создаём переменную метки
    Label response;

    // Запускаем программу
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) {

        // Устанавливаем название окна
        myStage.setTitle("Button Demo");

        // Создаём корневой узел с плавующей компановкой и промежутками в 10 пикселей (верт. и гориз.)
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрируем элементы
        rootNode.setAlignment(Pos.CENTER);

        // Создаём сцену с заданными параметрами: в качестве корневого узла используем rootNode
        Scene myScene = new Scene(rootNode, 300, 200);

        // Добавляем сцену на платформу
        myStage.setScene(myScene);

        // Устанавливаем начальный текст в метке
        response = new Label("Нажмите кнопку");

        // Создаём две кнопки
        Button btnUp = new Button("Вверх");
        Button btnDown = new Button("Вниз");

        // Добавляем действия (в анонимном классе) в обработчик событий, при нажатии на кнопку
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                response.setText("Вы нажали 'Вверх'");
            }
        });

        // Добавляем действия, но в виде лямбда-выражения,
        // т.к. интерфейс EventHandler имеет только один метод
        btnDown.setOnAction(actionEvent -> response.setText("Вы нажали 'Вниз'"));

        // Добавляем узлы (кнопки и метка) к корневому узлу
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Выводим полученную платформу на экран
        myStage.show();
    }
}
