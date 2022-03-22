package summer029;
//§d²Ð¦w U10716012

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

public class summer029 extends Application{

	public summer029() {
		// TODO Auto-generated constructor stub
	}

	public void start(Stage primaryStage) {
		MenuPane scene1 = new MenuPane();
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(scene1.pane);
		
		Scene scene = new Scene(borderPane,500,300);
		primaryStage.setTitle("Summer029 homework");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
