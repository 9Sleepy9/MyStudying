module com.example.chapter_17_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter_17_javafx to javafx.fxml;
    exports com.example.chapter_17_javafx;
}