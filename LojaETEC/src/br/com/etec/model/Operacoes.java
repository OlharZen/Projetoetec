package br.com.etec.model;

import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Operacoes {
	
	@FXML
	private TextField txfUsuario;
	@FXML
	private PasswordField psfSenha;
	@FXML
	private Button btnAcessar;
	@FXML
	private Button btnCadastrar; 
	
	@FXML
	private void validarUsuario(ActionEvent event) {
		String nomeUsuario;
		nomeUsuario = txfUsuario.getText();
		String senhaUsuario; 
		senhaUsuario = psfSenha.getText();
		
		if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
			if(nomeUsuario.isEmpty()) {
				mostrarAlerta(Alert.AlertType.WARNING, "Informe o nome !", " É necessário colocar o nome do usuário.");
			//nome vazio
		} else {
			if(senhaUsuario.isEmpty()) {
				mostrarAlerta(Alert.AlertType.WARNING, "Informe a senha !", " É necessário colocar a senha do usuário.");
			//senha vazia
		}
		}
			
	}
	
	}
	
	private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
		Alert alerta = new Alert(tipo);
		alerta.setTitle(titulo);
		alerta.setContentText(mensagem);
		alerta.showAndWait();
	}
}
