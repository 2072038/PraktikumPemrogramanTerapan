module com.fxsa.javafx_soal4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxsa.javafx_soal4 to javafx.fxml;
    exports com.fxsa.javafx_soal4;
}