/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Diego R
 */
public class ControllerDesierto2 implements Initializable {
    
   
    @FXML
    private Button btt_ruta1;
    @FXML
    private Button btt_ruta2;
    @FXML
    private Button btt_ruta3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {        
    }    
    
    @FXML
    private void btt_ruta1(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Desierto2_1.fxml"));              
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stagep = (Stage) this.btt_ruta1.getScene().getWindow();
            stagep.close();
            stage.show();      
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btt_ruta2(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Acertijo6.fxml"));              
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stagep = (Stage) this.btt_ruta2.getScene().getWindow();
            stagep.close();
            stage.show();      
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btt_ruta3(ActionEvent event) {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Desierto2_2.fxml"));              
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stagep = (Stage) this.btt_ruta3.getScene().getWindow();
            stagep.close();
            stage.show();      
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
