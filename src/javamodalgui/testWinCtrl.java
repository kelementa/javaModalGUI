/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamodalgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author kelement
 */
public class testWinCtrl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button btnTest;
    
    @FXML
    void btnTestOnclick(ActionEvent event) {
        Window tesztAblak = btnTest.getScene().getWindow();
        tesztAblak.hide();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
