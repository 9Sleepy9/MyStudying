package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;

public class TextFieldDemo extends Application {

    TextField tf;
    Label response;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) {

        // Устанавливаем заголовок окна приложения
        myStage.setTitle("Демонстрация работы текстового поля");

        // Создаём корневой узел с компоновкой FlowPane и промежутками
        FlowPane rootNode = new FlowPane(10, 10);

        // Устанавливаем центрирование для объектов
        rootNode.setAlignment(Pos.CENTER);

        // Создаём сцену с заданными параметрами
        Scene myScene = new Scene(rootNode, 300, 200);

        // Устанавливаем созданную сцену для платформы
        myStage.setScene(myScene);

        // Создаём метку
        response = new Label("Получить имя: ");

        // Создаём кнопку
        Button btnGetText = new Button("Получить имя");

        // Создаём текстовое поле
        tf = new TextField();

        // Устанавливаем текст-подсказку в поле
        tf.setPromptText("Введите имя");

        // Устанавливаем размер поля в 15 колонок
        tf.setPrefColumnCount(15);

        // Описываем реакцию на событие при нажатии клавиши Enter в текстовом поле
        tf.setOnAction( ae -> response.setText("Введено Имя: " + tf.getText()) );

        // Устанавливаем реакцию на событие при нажатии кнопки
        btnGetText.setOnAction( ae -> response.setText("Кнопка нажата. Имя: " + tf.getText()) );

        // Создаем разделитель (просто линия), для лучшей компановки
        Separator separator = new Separator();

        // Устанавливаем ширину разделителя
        separator.setPrefWidth(180);

        // Добавляем все необходимые объекты в граф сцены
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        // Выводим полученную сцену на экран
        myStage.show();
    }
}
