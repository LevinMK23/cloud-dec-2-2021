package com.geekbrains.cloud.jan.client;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthController {

    public TextField login;
    public TextField password;

    public void signIn(ActionEvent actionEvent) throws IOException {
        String login = this.login.getText();
        String password = this.password.getText();
        if (!login.isEmpty() && !password.isEmpty()) {
            Stage primary = (Stage) this.login.getScene().getWindow();
            primary.setScene(loadMainScene());
            primary.show();
        }
    }

    private Scene loadMainScene() throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("cloud_client.fxml"));
        return new Scene(parent);
    }
}
