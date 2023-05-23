package com.example.term_project_java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Popup;

import javax.swing.text.html.ImageView;
import java.awt.*;


public class HelloController {
    @FXML
    private Label welcomeText;



    @FXML
   private Button button1;

    @FXML
    private Label broccoli;



    public void BusClick()
 {
     //FXMLLoader fxmlLoader= new FXMLLoader(HelloApplication.class.getResource("bus-view.fxml"));
 }
    public void TrainClick()
    {

    }
    public void PlaneClick()
    {

    }
    public void FerryClick()
    {

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    protected void onButtonButtonClick()
    {

    }
}