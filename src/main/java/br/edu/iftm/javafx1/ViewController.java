package br.edu.iftm.javafx1;

import br.edu.iftm.javafx1.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

    @FXML
    private TextField campoUsuario;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private Button botaoLogin;

    @FXML
    private Button botaoCancelar;

    @FXML
    public void onBotaoLoginClick(){
        //Alert a = new Alert(AlertType.INFORMATION);
        StringBuilder s = new StringBuilder();
        s.append("Você clicou no botão de login.\n");
        s.append("Seu nome de usuário é: "+ campoUsuario.getText());
        s.append("\nSua senha é: " + campoSenha.getText());
        //a.setContentText(s.toString());
       // a.show();
        Alerts.showAlert("Mensagem", null, s.toString(), AlertType.INFORMATION );
    }

    @FXML
    public void onbotaoCancelar(){
        Alert a = new Alert(AlertType.ERROR);
        a.setContentText("Você clicou no botão de cancelar");
        a.show();
    }
}
