module com.fxsa.javafx_soal3.javafx_soal3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxsa.javafx_soal3.javafx_soal3 to javafx.fxml;
    exports com.fxsa.javafx_soal3.javafx_soal3;
}