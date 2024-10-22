import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.util.Random;

public class Week09LabProblem3 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene( root, 1000, 1000 ); 

        // Loop to make 25 triangles
		
		for(int i = 0; i < 25; i++) {
        
		Polygon triangle = new Polygon();
		// builds with random coordinates
		triangle.getPoints().addAll(new Double[] {
			Math.random()*1000, Math.random()*1000,
			Math.random()*1000, Math.random()*1000,
			Math.random()*1000, Math.random()*1000, });
		// sets fill to random rgb
		triangle.setFill(Color.rgb( (int)((double)Math.random()*255),
					(int)((double) Math.random()*255),
					(int)((double) Math.random()*255) ));
		// randomizes edge width
		triangle.setStrokeWidth(Math.random()*5);
		// sets edge color to random rgb
		triangle.setStroke(Color.rgb( (int)((double)Math.random()*255),
					(int)((double) Math.random()*255),
					(int)((double) Math.random()*255) ));
		// sets opacity to random value
		triangle.setOpacity(Math.random());
		root.getChildren().add(triangle);

		}

        stage.setTitle( "Week09LabProblem3" );
        stage.setScene( scene );
        stage.show();

    }
}
