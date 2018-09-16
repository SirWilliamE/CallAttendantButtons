import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) 
	{
		gui = new GUI();
		lights = new Lights();
		 launch(args);   
	}
	
	public static GUI gui;
	public static Lights lights;
	
	@Override
	    public void start(Stage stage) 
	    {
	        Scene scene = new Scene(new Group());
	         
	        ((Group) scene.getRoot()).getChildren().addAll(gui.dpVBox);

	        //***********************************************************
	        // Prepare the Stage
	        //***********************************************************
	        stage.setScene(scene);
	        stage.setTitle("Call Attendant Buttons");
	        stage.setWidth(560);
	        stage.setHeight(250);
	        stage.show();
	    }
}
