package application;

import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import java.io.*;

public class LoginController {

	public LoginController() {
		System.out.println("HI");
	}
	// Login fields
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	
	// Sign up fields
	@FXML
	private TextField uname;
	@FXML
	private TextField email;
	@FXML
	private PasswordField pwd;
	
	public void userLogin(ActionEvent event) throws IOException {
		System.out.println("Inside user login function");
	}
}
