/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamodalgui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author kelement
 */
public class LoginWinCtrl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField lblBejelenkezesUser;

    @FXML
    private PasswordField lblBejelentkezesPass;
    
    @FXML
    private Button btnBejelentkezes;

    @FXML
    void btnBejelentkezesOnclick(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainWin.fxml"));
        Parent root = loader.load();
        MainWinCtrl mainWindow = loader.<MainWinCtrl>getController();
        mainWindow.setLoggedInUser(lblBejelenkezesUser.getText());
        

        Window loginAblak = btnBejelentkezes.getScene().getWindow();
        loginAblak.hide();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
