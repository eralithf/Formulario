package com.example.formulario;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML private TextField nomeField;
    @FXML private TextField ultimoField;
    @FXML private TextField emailField;

    @FXML
    protected void onHelloButtonClick() {
        String nome = nomeField.getText();
        String ultimo = ultimoField.getText();
        String email = emailField.getText();


        if (nome.isBlank() || email.isBlank()) {
            exibirAlerta("Erro", "Nome e E-mail são obrigatórios!");
            return;
        }


        welcomeText.setText("Bem-vindo, " + nome + " " + ultimo + "!");
    }

    private void exibirAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}