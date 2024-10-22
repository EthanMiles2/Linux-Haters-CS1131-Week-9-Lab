import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;


public class Week09LabProblem4 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene(root, 1000, 1000 ); 
	
	int squareSize = 400;
	int squareRotate = 0;
	int squarePosition = 300;

	for(int i = 70; i > 0; i -= 8) {
		Rectangle square = new Rectangle();
		square.setX(squarePosition);
		square.setY(squarePosition);
		square.setWidth(squareSize);
		square.setHeight(squareSize);
		square.setFill(Color.TRANSPARENT);
		square.setStroke(Color.BLACK);
		square.setStrokeWidth(2);
        	square.getTransforms().add(new Rotate(squareRotate, 500, 500));
		root.getChildren().add(square);
		squareSize -= i;
		squareRotate += 13;
		squarePosition += (i / 2) ;
	}

        stage.setTitle( "Week09LabProblem4" );
        stage.setScene( scene );
        stage.show();
    }
}
