package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;

    @FXML
    private Button num4;
    
    @FXML
    private Button num5;
    
    @FXML
    private Button num6;
    
    @FXML
    private Button num7;
    
    @FXML
    private Button num8;
    
    @FXML
    private Button num9;
    
    @FXML
    private Button num0;

    @FXML
    private Button numDot;

    @FXML
    private Button suma;

    @FXML
    private Button resta;

    @FXML
    private Button multi;

    @FXML
    private Button div;

    @FXML
    private Button clear;

    @FXML
    private Text pantalla;

    @FXML
    private Text pantallaResult;

    private double opera1 = 0;
    private double opera2 = 0;
    private double operacion = 0;

    private String opera1String;
    private String opera2String;

    private void setOperaString(){
        opera1String = String.valueOf(opera1);
        opera2String = String.valueOf(opera2);

        if(String.valueOf(opera1String.charAt(opera1String.length()-2)).equals(".")&&
            String.valueOf(opera1String.charAt(opera1String.length()-1)).equals("0")){
            opera1String=opera1String.substring(0,opera1String.length()-2);
        }
        if(String.valueOf(opera2String.charAt(opera2String.length()-2)).equals(".")&&
            String.valueOf(opera2String.charAt(opera2String.length()-1)).equals("0")){
            opera2String=opera2String.substring(0,opera2String.length()-2);
        }
    }

 
    @FXML
    private void addDot(ActionEvent event){
        pantallaResult.setText(pantallaResult.getText()+".");
    }

    @FXML
    private void addNum(ActionEvent event) {
        Button boton =((Button)(event.getSource()));
        String number= String.valueOf(boton.getId().charAt(boton.getId().length()-1));
        pantallaResult.setText(pantallaResult.getText()+number);
        opera2=Double.parseDouble(pantallaResult.getText());
    
    }

    private void calcular(){
        if(operacion==1){ 
            opera1=opera1+opera2;
        }
        if(operacion==2){ 
            opera1=opera1-opera2;
        }
        if(operacion==3){ 
            opera1=opera1*opera2;
        }
        if(operacion==4){
            if(opera2==0){
                return;
            } 
            opera1=opera1/opera2;
        }
    }




    @FXML
    private void actionIgual(ActionEvent event) {
        setOperaString();
        if (operacion == 1){
            pantalla.setText(opera1String+"+"+opera2String+"=");
            
        }

        if (operacion == 2){
            pantalla.setText(opera1String+"-"+opera2String+"=");
        }

        if (operacion == 3){
            pantalla.setText(opera1String+"*"+opera2String+"=");
            
        }

        if (operacion == 4){
            if(opera2==0){
                pantalla.setText("No se puede dividir entre 0");
            }else{
            pantalla.setText(opera1String+"/"+opera2String+"=");
            }
        }
        
        calcular();
        operacion=0;
        setOperaString();
        
        pantallaResult.setText(String.valueOf(opera1String));
        opera2=opera1;
    }

    @FXML
    private void actionSuma(ActionEvent event) {
        if(!pantallaResult.getText().equals("")){

            if(operacion!=0){
                calcular();
            }else{
                opera1=opera2;
            }
            setOperaString();
            opera2=0;
        }
        operacion=1;
        
        pantalla.setText(opera1String+"+");
        pantallaResult.setText("");
    }

    @FXML
    private void actionResta(ActionEvent event) {

        if(!pantallaResult.getText().equals("")){

            if(operacion!=0){
                calcular();
            }else{
                opera1=opera2;
            }
            setOperaString();
            opera2=0;
        }
        operacion=2;
        pantalla.setText(opera1String+"-");
        pantallaResult.setText("");

    }

    @FXML
    private void actionMulti(ActionEvent event) {

        if(!pantallaResult.getText().equals("")){

            if(operacion!=0){
                calcular();
            }else{
                opera1=opera2;
            }
            setOperaString();
            opera2=0;
        }
        operacion=3;
        pantalla.setText(opera1String+"*");
        pantallaResult.setText("");

    }

    @FXML
    private void actionDiv(ActionEvent event) {

        if(pantallaResult.getText()=="0"){
            pantalla.setText("No se puede dividir por 0");
            return;
        }

        if(!pantallaResult.getText().equals("")){

            if(operacion!=0){
                calcular();
            }else{
                opera1=opera2;
            }
            setOperaString();
            opera2=0;
        }
        operacion=4;
        pantalla.setText(opera1String+"/");
        pantallaResult.setText("");

    }


    @FXML
    private void actionClear(ActionEvent event){
        pantalla.setText("");
        pantallaResult.setText("");
        opera1=0;
        opera2=0;
    }
}
