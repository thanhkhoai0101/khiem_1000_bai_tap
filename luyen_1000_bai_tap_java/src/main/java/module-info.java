module com.khoai.luyen_1000_bai_tap_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.khoai.luyen_1000_bai_tap_java to javafx.fxml;
    exports com.khoai.luyen_1000_bai_tap_java;
}
