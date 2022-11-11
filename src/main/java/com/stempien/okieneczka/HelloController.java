package com.stempien.okieneczka;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    public Button btn2;



    public void btn2clicked(ActionEvent actionEvent) {
            Random random = new Random();
            double a = random.nextInt(533);
            double b = random.nextInt(351);
            btn2.setLayoutX(a);
            btn2.setLayoutY(b);
    }

    public void btn1clicked(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(";)");
        alert.setHeaderText("Hehe ");
        alert.setContentText("Dziękuje");
        alert.showAndWait();
    }
}