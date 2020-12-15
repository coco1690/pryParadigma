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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Diego R
 */
public class ControllerBosque1 implements Initializable {
    
    String s = " ";
    @FXML
    private Button btt_ruta1;
    @FXML
    private ComboBox cb_ruta1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Ruta 1","Ruta 2","Ruta 3");
        cb_ruta1.setItems(list);
    }    

    @FXML
    private void Select(ActionEvent event) {
        s = cb_ruta1.getSelectionModel().getSelectedItem().toString();        
    }

    @FXML
    private void btt_ruta1(ActionEvent event) {
        if (s == " ")
        {
           Alert alert= new Alert(AlertType.INFORMATION);
           alert.setTitle("Debes Seleccionar");
           alert.setHeaderText(null);
           alert.setContentText("Debes Seleccionar Una Ruta");
           alert.showAndWait();
        }
        else if (s == "Ruta 1")
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Bosque1_1.fxml"));   
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stageb1 = (Stage) this.btt_ruta1.getScene().getWindow();
            stageb1.close();
            stage.show();
            System.out.println("Abre ventana bosque1_1");         
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }    
        else if (s == "Ruta 2")
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Bosque1_2.fxml"));   
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stageb1 = (Stage) this.btt_ruta1.getScene().getWindow();
            stageb1.close();
            stage.show();
            System.out.println("Abre ventana bosque1_2");         
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        else if (s == "Ruta 3")
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Acertijo1.fxml"));   
        try {          
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            Stage stageb1 = (Stage) this.btt_ruta1.getScene().getWindow();
            stageb1.close();
            stage.show();
            System.out.println("Abre ventana bosque1_3");         
                        
        } catch (IOException ex) {
            Logger.getLogger(ControllerPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }    
        }
    }

    
}
