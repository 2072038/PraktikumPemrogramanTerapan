module com.fxsa.javafx_soal2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxsa.javafx_soal2 to javafx.fxml;
    exports com.fxsa.javafx_soal2;
}