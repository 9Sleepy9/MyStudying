package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class JavaFXSkeleton extends Application {

    public static void main(String[] args) {

        System.out.println("Запуск приложения JavaFX");

        // Инициализируем запуск приложения, переходим к методам ниже
        launch(args);
    }

    // Переопределяем метод init, чтобы вывести строку
    public void init() {
        System.out.println("В теле метода init");
    }

    // "Основной" метод, подготавливающий приложение к запуску
    public void start(Stage myStage) {
        System.out.println("В теле метода start");

        // Устанавливаем заголовок окна приложения
        myStage.setTitle("Каркас приложения JavaFX");

        // Создаём "корневой узел" с плавающей компоновкой
        FlowPane rootNode = new FlowPane();

        // Создаём сцену для приложения (корневой узел, размеры окна)
        Scene myScene = new Scene(rootNode, 300, 200);

        // Добавляем созданную сцену на платформу
        myStage.setScene(myScene);

        // Отображаем сцену на платформе
        myStage.show();
    }

    // Переопределяем метод stop, чтобы вывести строку
    public void stop() {
        System.out.println("В теле метода stop");
    }
}