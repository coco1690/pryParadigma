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
public class ControllerAcertijo2 implements Initializable {
    
    
    @FXML
    private Button btt_Responder;
    @FXML
    private TextField tf_Acertijo1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void btt_Responder(ActionEvent event) {
            int respuesta = Integer.parseInt(tf_Acertijo1.getText().toString());
            System.out.println(respuesta);
            if(respuesta == 7)
            {
            Alert alert= new Alert(AlertType.INFORMATION);
            alert.setTitle("Respuesta Correcta");
            alert.setHeaderText(null);
            alert.setContentText("La Cueva Te Ha llevado a Un Lugar Muuuuuuy Frio. Allí Tienes Que Elegir el Camino que Tomará Nuestro Amigo Aventurero Grookey");
            Optional<ButtonType> action = alert.showAndWait();
            // Si hemos pulsado en aceptar
            if (action.get() == ButtonType.OK) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Nieve1.fxml"));   
                try {          
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setScene(scene);
                    Stage stageb1 = (Stage) this.btt_Responder.getScene().getWindow();
                    stageb1.close();
                    stage.show();
                    System.out.println("Abre ventana bosque2_3");         

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
            alert.setContentText("Respuesta incorrecta, Debes resolver el acertijo correctamente para poder continuar.");
            alert.showAndWait();
            }    
    }

    @FXML
    private void eventKey(KeyEvent event) {
        Object evt = event.getSource();
        if (evt.equals(tf_Acertijo1))
        {
            if (!Character.isDigit(event.getCharacter().charAt(0)))
            {   
                event.consume();       
            }
            if (tf_Acertijo1.getText().length() >= 2)
            {
                event.consume();
            }
        }
    }

    
}
