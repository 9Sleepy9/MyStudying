package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;

public class ListViewDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Демонстрация работы списка");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 200, 120);

        myStage.setScene(myScene);

        response = new Label("Выбор типа устройства");

        // Создаём объект типа ObservableList для хранения списка значений
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("Смартфон", "Планшет", "Ноутбук", "ПК");

        // Создание списка, отображающего элементы из списка computerTypes
        ListView<String> lvComputers = new ListView<>(computerTypes);

        // Устанавливаем значения высоты и ширины для списка
        lvComputers.setPrefSize(100, 70);

        // Создаём объект, который хранит модель выбора для списка,
        // с помощью него будем реагировать на события
        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();

        // С помощью полученного объекта добавляем слушателя для реагирования на выбор в списке
        lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override // Можно сделать лямбдой, но оставил так для примера
            public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
                // При наличии изменений отображаем выбранное значение
                response.setText("Выбрано устройство " + newVal);
            }
        });

        // Добавляем список и метку в граф сцены
        rootNode.getChildren().addAll(lvComputers, response);

        // Отображаем платформу вместе с её сценой
        myStage.show();
    }
}
