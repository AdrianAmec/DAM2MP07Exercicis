package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller0 {

    @FXML
    private Button  button1,botonGuardar;
    @FXML
    private AnchorPane container;

    @FXML
    private TextField textNom,textEdad;

    @FXML
    private Text mensajeError;

    @FXML
    private void animateToView1(ActionEvent event) {
        ((Controller1) UtilsViews.getController("View1")).updateData();
        UtilsViews.setViewAnimating("View1");
        
    }

    @FXML
    private void guardarDatos(ActionEvent event){
    
        if(textNom.getText().isEmpty()){
            mensajeError.setText("Ingrese un nombre");
            return;
        }
        if(textEdad.getText().isEmpty()){
            mensajeError.setText("Ingrese su edad");
            return;
        }
        try {
            Integer.parseInt(textEdad.getText().toString());
        } catch (Exception e) {
            mensajeError.setText("La edad deben ser numeros");
            return;
        }
        
        Main.edat=textEdad.getText().toString();
        Main.nom=textNom.getText().toString();
        button1.setDisable(false);
    }

}