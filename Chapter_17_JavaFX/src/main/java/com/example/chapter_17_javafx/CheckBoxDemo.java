package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.geometry.*;
public class CheckBoxDemo extends Application {

    // Создаём переменные для хранения флажков
    CheckBox cbSmartphone, cbTablet, cbNotebook, cbDesktop;

    // Переменные для хранения меток
    Label response, selected;

    // Переменная для хранения значений выбранных флажков
    String computers;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) {

        myStage.setTitle("CheckBox Demo");

        // Устанавливаем вертикальную компоновку
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 350, 200);

        myStage.setScene(myScene);

        // Создаём метки и устанавливаем значения
        Label heading = new Label("Какие у вас есть устройства?");
        response = new Label("");
        selected = new Label("");

        // Создаём флажки и устанавливаем надписи
        cbSmartphone = new CheckBox("Смартфон");
        cbTablet = new CheckBox("Планшет");
        cbNotebook = new CheckBox("Ноутбук");
        cbDesktop = new CheckBox("ПК");

        // Добавляем неопределённое состояние для флажка cbSmartphone
        cbSmartphone.setAllowIndeterminate(true);

        // Устанавливаем обработку событий для флажка
        cbSmartphone.setOnAction(ae -> {
            // В зависимости от того, установили или сняли флажок,
            // устанавливаем соответствующее значение для метки 'response'.
            // Также добавлено третье, неопределённое, состояние
            if (cbSmartphone.isIndeterminate())
                response.setText("Состояние смартфона не определено");
            else if (cbSmartphone.isSelected())
                response.setText("Был выбран " + cbSmartphone.getText());
            else
                response.setText("Выбор смартфона отменён");

            // Выводим все выбранные флажки
            showAll();
        });

        // Для сокращения кода вывел в метод
        setLocalAction(cbTablet);

        setLocalAction(cbNotebook);

        setLocalAction(cbDesktop);

        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, cbNotebook, cbDesktop, response, selected);

        myStage.show();

        showAll();
    }

    // Метод для вывода всех выбранных флажков в метке 'selected'
    void showAll() {
        computers = "";
        if (cbSmartphone.isSelected()) computers += "Смартфон ";
        if (cbTablet.isSelected()) computers += "Планшет ";
        if (cbNotebook.isSelected()) computers += "Ноутбук ";
        if (cbDesktop.isSelected()) computers += "ПК ";

        selected.setText("Выбраны устройства: " + computers);
    }

    void setLocalAction(CheckBox cb) {
        cb.setOnAction(ae -> {
            if (cb.isSelected())
                response.setText("Был выбран " + cb.getText());
            else
                response.setText("Выбор " + cb.getText() + " отменён");

            showAll();
        });
    }
}