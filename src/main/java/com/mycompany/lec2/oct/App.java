package com.mycompany.lec2.oct;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;



/**
 * JavaFX App
 */
public class App extends Application {
    Label label;

TextField tf;
TextField tf2;
    @Override
    public void start(Stage stage) 
            
    {
     
        
         label = new Label("Hello, Farzan Gui Demo");
        label.setLayoutX(400);
        label.setLayoutY(400);
        

        Button btn1= new Button("Button");
        btn1.setLayoutX(400);
        btn1.setLayoutY(200);
        btn1.setOnAction( v -> {
            label.setText("i clicked this - " + ((Button)v.getSource()).getText() );
        }
        );
        
        Button btn2= new Button("btn2");
        btn2.setLayoutX(250);
        btn2.setLayoutY(250);
        btn2.setOnAction( this::processBttn2 );
        
        
        tf = new TextField(" ");
        tf.setLayoutX(200);
        tf.setLayoutY(400);
        
        tf2 = new TextField(" ");
        tf2.setLayoutX(200);
        tf2.setLayoutY(200);
        
        
        
        
        
        
        

        
        Group gp = new Group(label,btn1,  tf, tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI demo 2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBttn2(ActionEvent arg0)
{
    String cntnt = tf.getText().trim();
    int nm = Integer.parseInt(cntnt);
    tf.setText("" + (nm *1000) );
    label.setTextFill(Color.RED);
};
}

