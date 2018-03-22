package helloworldfinal;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class helloworldfinal extends Application {
	
		public static void main(String[] args) {
			launch(args);
		}
		
	     public void start(Stage primaryStage) {
	    	 primaryStage.setTitle("Hello World! ");
	    	 Button btn=new Button();
	    	 btn.setText("Say 'Hello World'");
	    	 btn.setOnAction(new EventHandler<ActionEvent>() {
	    		 public void handle (ActionEvent event)
	    		 {System.out.println("Hello World!");}
	    	 });
	    	 
	    	StackPane root=new StackPane();
	    	root.getChildren().add(btn);
	    	primaryStage.setScene(new Scene(root,300,250));
	    	primaryStage.show();
	    	 }
			
		}


