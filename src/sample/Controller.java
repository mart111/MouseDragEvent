package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller  {


    @FXML
    Button button;

    double x;
    double y;

    public void initialize()
    {
        button.setOnMousePressed(event -> {

            x=event.getSceneX()-button.getLayoutX();
            y=event.getSceneY()-button.getLayoutY();

        });

        button.setOnMouseDragged(event -> {

            button.setLayoutX(x+event.getSceneX());
            button.setLayoutY(y+event.getSceneY());

        });
    }

}


