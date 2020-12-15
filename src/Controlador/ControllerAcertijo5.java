/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Diego R
 */
public class ControllerAcertijo5 implements Initializable {
    
    
    @FXML
    private Button btt_Responder;
    @FXML
    private TextField tf_Acertijo1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void btt_Responder(ActionEvent event) {
            String respuesta = tf_Acertijo1.getText().toString().toUpperCase();
            System.out.println(respuesta);
            if(respuesta.equals("C"))
            {
            Alert alert= new Alert(AlertType.INFORMATION);
            alert.setTitle("Respuesta Correcta");
            alert.setHeaderText(null);
            alert.setContentText("El pozo Mágico te lleva a un lugar cerca a un Oasis. Allí debes elegir el camino que tomará nuestro amigo Grookey para encontrarlo");
            Optional<ButtonType> action = alert.showAndWait();
            // Si hemos pulsado en aceptar
            if (action.get() == ButtonType.OK) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Desierto2.fxml"));   
                try {          
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setScene(scene);
                    Stage stageb1 = (Stage) this.btt_Responder.getScene().getWindow();
                    stageb1.close();
                    stage.show();
                    System.out.println("Abre ventana Desierto1");         

                } catch (IOException ex) {
                    Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } 
            } 
            }
            else{
                tf_Acertijo1.setText("");
            Alert alert= new Alert(AlertType.WARNING);
            alert.setTitle("Respuesta Incorrecta");
            alert.setHeaderText(null);
            alert.setContentText("Respuesta incorrecta, Debes resolver el acertijo correctamente para poder continuar.(Ingresa A,B,C o D. Según Corresponda)");
            alert.showAndWait();
            }    
    }

    @FXML
    private void eventKey(KeyEvent event) {
        Object evt = event.getSource();
        if (evt.equals(tf_Acertijo1))
        {
            if (!Character.isAlphabetic(event.getCharacter().charAt(0)))
            {   
                event.consume();       
            }
            if (tf_Acertijo1.getText().length() >= 1)
            {
                event.consume();
            }
        }
    }

    
}
