import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
CS1131 - Lab Group 2 - Linux Haters
@author Kaleb Fresonke, Ben Peters, Jason Miles, Ethan Miles
Last Updated Oct 22 2024
*/

public class Week09LabProblem1 extends Application {
    public void start( Stage stage ) {
        Group root = new Group( );
        Scene scene = new Scene( root, 400, 300 ); 

        Rectangle grass = new Rectangle( 0, 200, 400, 100 );
	grass.setFill( Color.rgb( 113, 122, 40 ));
	grass.setStroke( Color.rgb( 113, 122, 40 ));
	grass.setStrokeWidth( 1 );
	root.getChildren( ).add( grass );

        Rectangle sky = new Rectangle( 0, 0, 400, 200 );
	sky.setFill( Color.rgb( 123, 167, 179 ));
	sky.setStroke( Color.rgb( 123, 167, 179 ));
	sky.setStrokeWidth( 1 );
	root.getChildren( ).add( sky );

	Ellipse cloudPart1 = new Ellipse(); {
	    cloudPart1.setCenterX( 30.0f );
	    cloudPart1.setCenterY( 30.0f );
	    cloudPart1.setRadiusX( 60.0f );
	    cloudPart1.setRadiusY( 7.0f );
	}
	cloudPart1.setFill( Color.rgb( 247, 236, 220 ));
	cloudPart1.setStroke( Color.rgb( 247, 236, 220 ));
	cloudPart1.setStrokeWidth( 1 );
	root.getChildren( ).add( cloudPart1 );

	Ellipse cloudPart2 = new Ellipse(); {
	    cloudPart2.setCenterX( 25.0f );
	    cloudPart2.setCenterY( 20.0f );
	    cloudPart2.setRadiusX( 40.0f );
	    cloudPart2.setRadiusY( 15.0f );
	}
	cloudPart2.setFill( Color.rgb( 247, 236, 220 ));
	cloudPart2.setStroke( Color.rgb( 247, 236, 220 ));
	cloudPart2.setStrokeWidth( 1 );
	root.getChildren( ).add( cloudPart2 );

	Circle sun = new Circle( 400, 0, 75 );
	sun.setFill( Color.rgb( 250, 213, 80 ));
	sun.setStroke( Color.rgb( 250, 213, 80 ));
	sun.setStrokeWidth( 1 );
	root.getChildren( ).add( sun );

	Line sunRay1 = new Line( 400, 0, 275, 0 );
	sunRay1.setStroke( Color.rgb( 250, 213, 80 ));
	sunRay1.setStrokeWidth( 5 );
	root.getChildren( ).add( sunRay1 );

	Line sunRay2 = new Line( 400, 0, 400, 125 );
	sunRay2.setStroke( Color.rgb( 250, 213, 80 ));
	sunRay2.setStrokeWidth( 5 );
	root.getChildren( ).add( sunRay2 );

	Line sunRay3 = new Line( 400, 0, 311.6116524, 88.38834765 );
	sunRay3.setStroke( Color.rgb( 250, 213, 80 ));
	sunRay3.setStrokeWidth( 5 );
	root.getChildren( ).add( sunRay3 );

	Line sunRay4 = new Line( 400, 0, 352.164571, 115.4849416 );
	sunRay4.setStroke( Color.rgb( 250, 213, 80 ));
	sunRay4.setStrokeWidth( 5 );
	root.getChildren( ).add( sunRay4 );

	Line sunRay5 = new Line( 400, 0, 284.5150584, 47.83542905 );
	sunRay5.setStroke( Color.rgb( 250, 213, 80 ));
	sunRay5.setStrokeWidth( 5 );
	root.getChildren( ).add( sunRay5 );


        stage.setTitle( "Week09LabProblem1" );
        stage.setScene( scene );
        stage.show();
    }
}
