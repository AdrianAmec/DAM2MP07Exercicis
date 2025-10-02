package com.project;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller1{

    @FXML
    private Button button1;
    @FXML
    private AnchorPane container;

    @FXML 
    private Text saludo;

    @FXML
    private void animateToView0(ActionEvent event) {
        
        UtilsViews.setViewAnimating("View0");

    }
    
    public void updateData() {


        saludo.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

}