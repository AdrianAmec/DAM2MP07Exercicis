package com.project;

import java.util.Objects;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ControllerListItem{

    @FXML
    private Text text;

    @FXML
    private ImageView img;

    @FXML
    private AnchorPane select;

    
    //private Controller mainController;

    // public void setParentController(Controller controller) {
    //     this.mainController = controller;
    // }
    

    public void alinearMsg(){
        img.setLayoutX(445);
        
    }

    public ControllerListItem(){
        
    }
    public void setText(String text) {
        this.text.setText(text);
    }

    public String getText(){
        return text.getText().toString();
    }
    // @FXML
    // public void selectOption(MouseEvent event) throws Exception{
    //     //System.out.println(this.getTitle());
    //     mainController.accion(this.getTitle().toString());
    // }
    // @FXML
    // public void glowOption(MouseEvent event){
    //     select.setEffect(new DropShadow(10, Color.GRAY));
    // }

    // @FXML
    // public void noGlowOption(MouseEvent event){
    //     select.setEffect(null);
    // }



    public void setImatge(String imagePath) {
        try {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
            this.img.setImage(image);
        } catch (NullPointerException e) {
            System.err.println("Error loading image asset: " + imagePath);
            e.printStackTrace();
        }
    }

    

}