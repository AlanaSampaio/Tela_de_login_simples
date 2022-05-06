package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class telaController {

	@FXML
    private Label acessoLiberado;
	
	@FXML
    private Button botaoAcessar;

    @FXML
    private TextField inserirEmail;

    @FXML
    private PasswordField inserirSenha;
    
    @FXML
    public void verificarAcesso() {
    	if (verificaEmailSenha(inserirEmail.getText(), new String( inserirSenha.getText()))) {
    		System.out.println("Botão em plena funcionalidade");
    		acessoLiberado.setText("Acesso liberado!");
    	} else {
    		acessoLiberado.setText("Informações incorretas!");
    	}
    }
    
    public boolean verificaEmailSenha(String email, String senha) {
		return email.equals("admin") && senha.equals("1234");
    	
    }
}
