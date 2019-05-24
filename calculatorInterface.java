package javaapplication4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaApplication4 extends Application 
{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(10);
        pane.setVgap(10);

        // Place nodes in the pane
        pane.add(new Label("Number 1:"), 0, 0);
        TextField num1 = new TextField();
        num1.setMaxWidth(60);
        pane.add(num1, 1, 0);

        pane.add(new Label("Number 2:"), 0, 1); 
        TextField num2 = new TextField();
        num2.setMaxWidth(60);
        pane.add(num2, 1, 1);

        pane.add(new Label("Result:"), 0, 2);
        TextField result = new TextField();
        result.setMaxWidth(60);
        pane.add(result, 1, 2);

        Button btAdd = new Button("Add");
        pane.add(btAdd, 0, 3);
        GridPane.setHalignment(btAdd, HPos.LEFT);

        Button btMult = new Button("Multiply");
        pane.add(btMult, 0, 4);
        GridPane.setHalignment(btMult, HPos.LEFT);

        Button btSub = new Button("Subtract");
        pane.add(btSub, 1, 3);
        GridPane.setHalignment(btSub, HPos.RIGHT);
        Button btDiv = new Button("Divide");
        pane.add(btDiv, 1, 4);
        GridPane.setHalignment(btDiv, HPos.LEFT);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 
