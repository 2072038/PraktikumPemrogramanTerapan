module com.fxsoal1.javafx_kelas1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fxsoal1.javafx_kelas1 to javafx.fxml;
    exports com.fxsoal1.javafx_kelas1;
}