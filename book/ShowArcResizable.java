import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class ShowArcResizable extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new MyArcs(), 300, 200);
    primaryStage.setTitle("ShowArc"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

class MyArcs extends Pane {
  private void paint() {  
    double centerX = getWidth() / 2;
    double centerY = getHeight() / 2;
    double radiusX = 0.8 * getWidth() / 2;
    double radiusY = 0.8 * getHeight() / 2;
    
    Arc arc1 = new Arc(centerX, centerY, radiusX, radiusY, 30, 35); 
    arc1.setFill(Color.RED); // Set fill color
    arc1.setType(ArcType.ROUND); // Set arc type
    
    Arc arc2 = new Arc(centerX, 
      centerY, radiusX, radiusY, 30 + 90, 35);
    arc2.setFill(Color.WHITE);
    arc2.setType(ArcType.OPEN);
    arc2.setStroke(Color.BLACK);

    Arc arc3 = new Arc(centerX, 
      centerY, radiusX, radiusY, 30 + 180, 35);
    arc3.setFill(Color.WHITE);
    arc3.setType(ArcType.CHORD);
    arc3.setStroke(Color.BLACK);
    getChildren().add(new Text(20, 170, "arc3: chord")); 
    
    Arc arc4 = new Arc(centerX, 
      centerY, radiusX, radiusY, 30 + 270, 35);
    arc4.setFill(Color.GREEN);
    arc4.setType(ArcType.CHORD);
    arc4.setStroke(Color.BLACK);
    getChildren().clear();
 
    getChildren().addAll(arc1, arc2, arc3, arc4, 
      new Text(centerX + radiusX - 100, 
        centerY - radiusY, "arc1: round"),
      new Text(centerX - radiusX, centerY - radiusY, "arc2: open"),
      new Text(centerX - radiusX, centerY + radiusY, "arc3: chord"),
      new Text(centerX + radiusX - 100,
        centerY + radiusY, "arc4: chord")); 
  }
  
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paint();
  }
  
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paint();
  }
}
