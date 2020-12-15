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
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.imageio.IIOException;

/**
 *
 * @author Diego R
 */
public class ControllerPrincipal implements Initializable {
    
  
    @FXML 
    private Button btnStart;
    
    @FXML
    private void btnStart(ActionEvent event) {
        System.out.println("Click en Start");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Bosque1.fxml"));              
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stagep = (Stage) this.btnStart.getScene().getWindow();
            stagep.close();
            stage.show();
            System.out.println("Abre ventana y cierra la principal");         
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
