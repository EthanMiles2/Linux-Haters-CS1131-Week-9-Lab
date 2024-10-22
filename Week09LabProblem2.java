import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Week09LabProblem2 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene( root, 400, 400 ); 
        scene.setFill( Color.BLACK );

	Line lineX = new Line();
	lineX.setStroke( Color.CHARTREUSE );
	lineX.setStrokeWidth(1.0);
	lineX.setStartX(0.0f);
	lineX.setStartY(200.0f);
	lineX.setEndX(400.0f);
	lineX.setEndY(200.0f);
	root.getChildren().add(lineX);

	Line lineY = new Line();
	lineY.setStroke( Color.CHARTREUSE );
	lineY.setStrokeWidth(1.0);
	lineY.setStartX(200.0f);
	lineY.setStartY(0.0f);
	lineY.setEndX(200.0f);
	lineY.setEndY(400.0f);
	root.getChildren().add(lineY);

	double f = 0.0;
	for (double i = 20.0; i <= 40.0; i++) {
		Line line = new Line();
		line.setStroke( Color.CHARTREUSE );
		line.setStrokeWidth( 1.0 );
		line.setStartY( f * 10.0 );
		line.setStartX( 200.0 );
		line.setEndY( 200.0 );
		line.setEndX( i * 10.0 );
		f++;
		root.getChildren().add( line );
	}
	
	f = 0.0;
	for (double i = 20.0; i >= 0.0; i--) {
		Line line = new Line();
		line.setStroke( Color.CHARTREUSE );
		line.setStrokeWidth( 1.0 );
		line.setStartY( f * 10.0 );
		line.setStartX( 200.0 );
		line.setEndY( 200.0 );
		line.setEndX( i * 10.0 );
		f++;
		root.getChildren().add( line );
	}

	f = 20.0;
	for (double i = 0; i <= 20.0; i++) {
		Line line = new Line();
		line.setStroke( Color.CHARTREUSE );
		line.setStrokeWidth( 1.0 );
		line.setStartY( f * 10 );
		line.setStartX( 200.0 );
		line.setEndY( 200.0  );
		line.setEndX( i * 10.0 );
		f++;
		root.getChildren().add( line );
	}
	
	f = 20.0;
	for (double i = 40.0; i >= 20.0; i--) {
		Line line = new Line();
		line.setStroke( Color.CHARTREUSE );
		line.setStrokeWidth( 1.0 );
		line.setStartY( f * 10 );
		line.setStartX( 200.0 );
		line.setEndY( 200.0 );
		line.setEndX( i * 10.0 );
		f++;
		root.getChildren().add( line );
	}




        
        stage.setTitle( "Week09LabProblem2" );
        stage.setScene( scene );
        stage.show();
    }
}
