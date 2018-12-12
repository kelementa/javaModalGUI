/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamodalgui;



import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author kelement
 */
public class MainWinCtrl implements Initializable {
    
    
    private static String loggedInUser = "";
    
    @FXML
    private MenuItem menuKilepes;

    @FXML
    private MenuItem menuNevjegy;
    
    @FXML
    private MenuItem menuBejelentkezes;
    
    @FXML
    private Label lblLoginText;
    
    @FXML
    private MenuItem menuTeszt;
    
    @FXML
    private MenuItem menuKijelentkezes;

    @FXML
    void menuKijelentkezesOnclick(ActionEvent event) {
        Alert kijelentkezesW = new Alert(AlertType.CONFIRMATION);
        kijelentkezesW.setTitle("Kijelentkezés");
        kijelentkezesW.setHeaderText("Valóban kijelentkezik?");
        kijelentkezesW.setContentText("");
        Optional <ButtonType>result = kijelentkezesW.showAndWait();
        if (result.get() == ButtonType.OK) {
            loggedInUser = "";
        }
        lblLoginText.setText(getLoggedInUser());
    }
    
    @FXML
    void menuTesztOnclick(ActionEvent event) throws Exception {
        tesztAblak("testWin.fxml", "tesztablak");
    }
    
    void tesztAblak(String FXMLUrl, String title) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(FXMLUrl));
        Scene scene = new Scene(root);
        Stage ablak = new Stage();
        ablak.setTitle(title);
        ablak.setResizable(false);
        ablak.initModality(Modality.APPLICATION_MODAL);
        ablak.setScene(scene);
        ablak.showAndWait();
    }
    
    public String getLoggedInUser() {
        if (loggedInUser.isEmpty() || loggedInUser.equals("") || loggedInUser.equals(" ")) {
            return "Nincs bejelentkezve felhasználó.";
        }
        else return loggedInUser;
    }
    
    @FXML
    public void setLoggedInUser(String user) {
        loggedInUser = user;
    }
    
    @FXML
    void menuBejelentkezesOnclick(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginWin.fxml"));
        Scene scene = new Scene(root);
        Stage nevjegyWin = new Stage();
        nevjegyWin.setScene(scene);
        nevjegyWin.setTitle("Bejelentkezés");
        nevjegyWin.setResizable(false);
        nevjegyWin.initModality(Modality.APPLICATION_MODAL);
        nevjegyWin.setScene(scene);
        nevjegyWin.showAndWait();
        
        lblLoginText.setText(getLoggedInUser());
        
    }

    @FXML
    void menuKilepesOnclick(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void menuNevjegyOnclick(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("nevjegyWin.fxml"));
        Scene scene = new Scene(root);
        Stage nevjegyWin = new Stage();
        nevjegyWin.setScene(scene);
        nevjegyWin.setTitle("Névjegy");
        nevjegyWin.setResizable(false);
        nevjegyWin.initModality(Modality.APPLICATION_MODAL);
        nevjegyWin.setScene(scene);
        nevjegyWin.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lblLoginText.setText(getLoggedInUser());
        
    }    
    
}
