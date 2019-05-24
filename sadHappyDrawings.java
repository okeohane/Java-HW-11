package javaapplication1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
public class JavaApplication1 extends Application{
    @Override
    public void start(Stage primaryStage)  {
    //SAD FACE X-(100, 300) Y-(100, 300)
        //outer circle
        Circle c1 = new Circle();
        c1.setStroke(Color.BLACK);
        c1.setFill(Color.WHITE);
        c1.setCenterX(200);
        c1.setCenterY(200);
        c1.setRadius(100);
        //nose
        Line l1c1 = new Line(200, 170, 180, 210);
        Line l2c1 = new Line(180, 210, 220, 210);
        //frown
        Arc frown = new Arc(200, 260, 45, 25, 0, 180);
        frown.setFill(Color.WHITE);
        frown.setType(ArcType.OPEN);
        frown.setStroke(Color.BLACK); 
        //pupils
        Circle p1c1 = new Circle(165, 160, 12);
        p1c1.setStroke(Color.BLACK);
        p1c1.setFill(Color.BLACK);
        
        Circle p2c1 = new Circle(235, 160, 12);
        p2c1.setStroke(Color.BLACK);
        p2c1.setFill(Color.BLACK);
        //eyes
        Ellipse e1c1 = new Ellipse(165, 160, 25, 18);
        e1c1.setStroke(Color.BLACK);
        e1c1.setFill(Color.TRANSPARENT);
        
        Ellipse e2c1 = new Ellipse(235, 160, 25, 18);
        e2c1.setStroke(Color.BLACK);
        e2c1.setFill(Color.TRANSPARENT);
        //eyebrows
        Arc b1c1 = new Arc(165, 145, 30, 15, 20, 145);
        b1c1.setFill(Color.TRANSPARENT);
        b1c1.setType(ArcType.OPEN);
        b1c1.setStroke(Color.BLACK);
        
        Arc b2c1 = new Arc(235, 145, 30, 15, 20, 145);
        b2c1.setFill(Color.TRANSPARENT);
        b2c1.setType(ArcType.OPEN);
        b2c1.setStroke(Color.BLACK);
    //HAPPY FACE X-(400, 600) Y- (100, 300)
        //outer circle
        Circle c2 = new Circle();
        c2.setStroke(Color.BLACK);
        c2.setFill(Color.WHITE);
        c2.setCenterX(500);
        c2.setCenterY(200);
        c2.setRadius(100);
        //nose
        Line l1c2 = new Line(500, 170, 480, 210);
        Line l2c2 = new Line(480, 210, 520, 210);
        //smile
        Arc smile = new Arc(500, 240, 45, 25, 0, -180);
        smile.setFill(Color.WHITE);
        smile.setType(ArcType.OPEN);
        smile.setStroke(Color.BLACK);
        //pupils
        Circle p1c2 = new Circle(465, 160, 12);
        p1c2.setStroke(Color.BLACK);
        p1c2.setFill(Color.BLACK);
        
        Circle p2c2 = new Circle(535, 160, 12);
        p2c2.setStroke(Color.BLACK);
        p2c2.setFill(Color.BLACK);
        //eyes
        Ellipse e1c2 = new Ellipse(465, 160, 25, 18);
        e1c2.setStroke(Color.BLACK);
        e1c2.setFill(Color.TRANSPARENT);
        
        Ellipse e2c2 = new Ellipse(535, 160, 25, 18);
        e2c2.setStroke(Color.BLACK);
        e2c2.setFill(Color.TRANSPARENT);
        //eyebrows
        Arc b1c2 = new Arc(465, 145, 30, 15, 20, 145);
        b1c2.setFill(Color.TRANSPARENT);
        b1c2.setType(ArcType.OPEN);
        b1c2.setStroke(Color.BLACK);
        
        Arc b2c2 = new Arc(535, 145, 30, 15, 20, 145);
        b2c2.setFill(Color.TRANSPARENT);
        b2c2.setType(ArcType.OPEN);
        b2c2.setStroke(Color.BLACK);
        
        //setting scene and pane and displaying all shapes together
        Pane pane = new Pane();
        pane.getChildren().addAll(c1, c2, l1c1, l2c1, l1c2, l2c2, frown, smile, p1c1,
                p2c1, p1c2, p2c2, e1c1, e2c1, e1c2, e2c2, b1c1, b2c1, b1c2, b2c2);
        Scene scene = new Scene(pane, 700, 500);
        primaryStage.setTitle("Sad Smile"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
