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
public class NevjegyWinCtrl implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btnMenuNevjegy;

    @FXML
    void btnMenuNevjegyOnclick(ActionEvent event) {
        Window nevjegyAblak = btnMenuNevjegy.getScene().getWindow();
        nevjegyAblak.hide();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
