module com.stempien.okieneczka {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.stempien.okieneczka to javafx.fxml;
    exports com.stempien.okieneczka;
}