package org.example.reteasocializare;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.reteasocializare.Domain.Utilizator;
import org.example.reteasocializare.Service.Network;

public class RegisterController {

    private Network network;

    @FXML
    private Button buttonRegister;

    @FXML
    private Button buttonBack;

    @FXML
    private TextField textFieldUsername;

    @FXML
    private TextField textFieldNume;

    @FXML
    private TextField textFieldPrenume;

    @FXML
    private PasswordField passwordField;


    public void handleBack() {
        Stage stage = (Stage) buttonBack.getScene().getWindow();
        stage.close();
        System.out.println("Back to login");
    }

    public void handleRegister() {
        String username = textFieldUsername.getText();
        String nume = textFieldNume.getText();
        String prenume = textFieldPrenume.getText();
        String password = passwordField.getText();
        network.addUtilizator(new Utilizator(username, nume, prenume, password));
        System.out.println("Register successful!");
    }

    @FXML
    public void initialize() {
        textFieldUsername.setPromptText("Username");
        textFieldNume.setPromptText("Nume");
        textFieldPrenume.setPromptText("Prenume");
        passwordField.setPromptText("Password");
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
