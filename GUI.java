
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GUI
{
		
	Button clearButton;
	
	CheckBox chk1;
	CheckBox chk2;
	CheckBox chk3;
	CheckBox chk4;
	CheckBox chk5;
	
	Circle light1;
	Circle light2;
	Circle light3;
	Circle light4;
	Circle light5;
	
	HBox dpBtnHBox;
	VBox dpVBox;
	HBox idSearchHBox;
	
	public GUI()
	{
			
		chk1 = new CheckBox("Seat 1");
		chk2 = new CheckBox("Seat 2");
		chk3 = new CheckBox("Seat 3");
		chk4 = new CheckBox("Seat 4");
		chk5 = new CheckBox("Seat 5");
		
		chk1.setTextFill(Color.BLACK);
		chk1.setContentDisplay(ContentDisplay.LEFT);
		chk1.setStyle("-fx-border-color: black");
		chk1.setSelected(false);
		chk1.setPadding(new Insets(5, 5, 5, 5));
		
		chk2.setTextFill(Color.BLACK);
		chk2.setContentDisplay(ContentDisplay.LEFT);
		chk2.setStyle("-fx-border-color: black");
		chk2.setSelected(false);
		chk2.setPadding(new Insets(5, 5, 5, 5));
		
		chk3.setTextFill(Color.BLACK);
		chk3.setContentDisplay(ContentDisplay.LEFT);
		chk3.setStyle("-fx-border-color: black");
		chk3.setSelected(false);
		chk3.setPadding(new Insets(5, 5, 5, 5));
		
		chk4.setTextFill(Color.BLACK);
		chk4.setContentDisplay(ContentDisplay.LEFT);
		chk4.setStyle("-fx-border-color: black");
		chk4.setSelected(false);
		chk4.setPadding(new Insets(5, 5, 5, 5));

		chk5.setTextFill(Color.BLACK);
		chk5.setContentDisplay(ContentDisplay.LEFT);
		chk5.setStyle("-fx-border-color: black");
		chk5.setSelected(false);
		chk5.setPadding(new Insets(5, 5, 5, 5));
				
		light1 = new Circle(500, 400, 32);
		light1.setStroke(Color.rgb(100, 100, 250));
		light1.setFill(Color.WHITE);
		
		light2 = new Circle(500, 400, 32);
		light2.setStroke(Color.rgb(100, 100, 250));
		light2.setFill(Color.WHITE);
		
		light3 = new Circle(500, 400, 32);
		light3.setStroke(Color.rgb(100, 100, 250));
		light3.setFill(Color.WHITE);
		
		light4 = new Circle(500, 400, 32);
		light4.setStroke(Color.rgb(100, 100, 250));
		light4.setFill(Color.WHITE);
		
		light5 = new Circle(500, 400, 32);
		light5.setStroke(Color.rgb(100, 100, 250));
		light5.setFill(Color.WHITE);
			 
		// Clear Button
		clearButton = new Button("Clear All Call Buttons");
		clearButton.setTranslateX(10);
		
		// Create the dpBtnHBox
		dpBtnHBox = new HBox();
		dpBtnHBox.setPadding(new Insets(10,10,10,10));
		dpBtnHBox.setSpacing(5);
	    dpBtnHBox.getChildren().addAll(light1, light2, light3, light4, light5);
	    
	    // Create new HBox for the ID Search
	    idSearchHBox = new HBox();
	    idSearchHBox.setPadding(new Insets(10,10,10,10));
	    idSearchHBox.setSpacing(5);
	    idSearchHBox.getChildren().addAll( chk1, chk2, chk3, chk4, chk5, clearButton);

	    // Create the dpVBox
		dpVBox = new VBox();
		dpVBox.setMaxWidth(700);
		dpVBox.setPadding(new Insets(10,10,10,10));
		dpVBox.setSpacing(5);
	    dpVBox.getChildren().addAll(dpBtnHBox, idSearchHBox);
	    
	    
	    EventHandler<ActionEvent> handler1 = e -> {
	    	
	    	Lights.callAttendant(0);
	    	
	    	if (Lights.list.get(0) == 1) {
	    		light1.setFill(Color.YELLOW);
	    	}
	    	else {
	    		light1.setFill(Color.WHITE);
	    	}
	    }; // end Handler1
	    
	    EventHandler<ActionEvent> handler2 = e -> {
	    
	    	Lights.callAttendant(1);
	    	
	    	if (Lights.list.get(1) == 1) {
	    		light2.setFill(Color.YELLOW);
	    	}
	    	else {
	    		light2.setFill(Color.WHITE);
	    	}
	    }; // end Handler2
	    
	    EventHandler<ActionEvent> handler3 = e -> {
	    	
	    	Lights.callAttendant(2);
	    	
	    	if (Lights.list.get(2) == 1) {
	    		light3.setFill(Color.YELLOW);
	    	}
	    	else {
	    		light3.setFill(Color.WHITE);
	    	}
	    }; // end Handler3
	    
	    EventHandler<ActionEvent> handler4 = e -> {
	    	
	    	Lights.callAttendant(3);
	    	
	    	if (Lights.list.get(3) == 1) {
	    		light4.setFill(Color.YELLOW);
	    	}
	    	else {
	    		light4.setFill(Color.WHITE);
	    	}
		}; // end Handler4
		    
		EventHandler<ActionEvent> handler5 = e -> {
		    	
			Lights.callAttendant(4);
	    	
	    	if (Lights.list.get(4) == 1) {
	    		light5.setFill(Color.YELLOW);
	    	}
	    	else {
	    		light5.setFill(Color.WHITE);
	    	}
		}; // end Handler5
		    
			    
	    EventHandler<ActionEvent> clearHandler = e -> {

		    Lights.ClearAll();
		    
		    chk1.setSelected(false);
		    chk2.setSelected(false);
		    chk3.setSelected(false);
		    chk4.setSelected(false);
		    chk5.setSelected(false);
		    
		    light1.setFill(Color.WHITE);
		    light2.setFill(Color.WHITE);
		    light3.setFill(Color.WHITE);
		    light4.setFill(Color.WHITE);
		    light5.setFill(Color.WHITE);
		    				    
		 }; // end clearHandler
	    
	    clearButton.setOnAction(clearHandler);
	    chk1.setOnAction(handler1);
	    chk2.setOnAction(handler2);
	    chk3.setOnAction(handler3);
	    chk4.setOnAction(handler4);
	    chk5.setOnAction(handler5);
	    		
	} // End Constructor
	
	// Could add light that blinks at attendant station with seat number
	// Make it a method in Lights class that checks the ArrayList and returns seat nums of lights on
	
}
