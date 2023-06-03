module com.example.khiem_1000_bai_tap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.khiem_1000_bai_tap to javafx.fxml;
    exports com.example.khiem_1000_bai_tap;
}
