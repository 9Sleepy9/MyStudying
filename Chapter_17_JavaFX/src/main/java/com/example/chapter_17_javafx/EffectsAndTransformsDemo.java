package com.example.chapter_17_javafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.geometry.*;

public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    // Создаём объекты для эффектов
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    // Создаём кнопки (для тестирования)
    Button btnRotate = new Button("Повернуть");
    Button btnBlur = new Button("Размыть");
    Button btnScale = new Button("Увеличить");

    // Создаём метку для проверки эффекта отражения
    Label reflect = new Label("Отражение добавляет визуальный блеск");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage myStage) throws Exception {

        // Стандартная компановка сцены
        myStage.setTitle("Демонстрация работы эффектов и преобразований");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);

        // Добавляем преобразования в список преобразований для кнопок
        // (blur уже добавлен по умолчанию)
        btnRotate.getTransforms().add(rotate);
        btnScale.getTransforms().add(scale);

        // Устанавливаем параметры отражения для метки
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        // Реализуем функцию поворота при нажатии на кнопку btnRotate
        btnRotate.setOnAction( ae -> {
            angle += 15;

            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth() / 2);
            rotate.setPivotY(btnRotate.getHeight() / 2);
        });

        // Реализуем увеличение при нажатии на кнопку btnScale
        btnScale.setOnAction( ae -> {
            scaleFactor += 0.1;
            if (scaleFactor > 2.0) scaleFactor = 0.4;

            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
        });

        // Реализуем размытие при нажатии на кнопку btnBlur
        btnBlur.setOnAction( ae -> {
            if (blurVal == 10.0) {
                blurVal = 1.0;
                btnBlur.setEffect(null);
                btnBlur.setText("Размытие отменено");
            }
            else if (btnBlur.getText().equals("Размытие отменено")) {
                btnBlur.setText("Добавить размытие");
            }
            else {
                blurVal++;
                btnBlur.setEffect(blur);
                btnBlur.setText("Добавить размытие");
            }

            blur.setWidth(blurVal);
            blur.setHeight(blurVal);
        });

        // Добавляем созданные узлы к корневому узлу сцены
        rootNode.getChildren().addAll(
                btnRotate, btnScale, btnBlur, reflect
        );

        // Выводим созданную платформу в приложении
        myStage.show();
    }
}