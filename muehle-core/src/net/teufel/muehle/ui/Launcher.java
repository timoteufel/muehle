package net.teufel.muehle.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CircleBuilder;
import javafx.stage.Stage;


public class Launcher extends Application{

	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Yin_und_Yang");
		BorderPane root = new BorderPane();
		
		Circle circle = CircleBuilder.create()
				.radius(20)
				.centerX(20)
				.centerY(20)
				.build();
		
		Circle circle2 = CircleBuilder.create()
				.radius(20)
				.centerX(80)
				.centerY(20)
				.stroke(Color.GRAY)
				.fill(Color.GRAY)
				.build();
		
		root.setLeft(circle);
		root.setRight(circle2);
		primaryStage.setScene(new Scene(root, 400, 400));
		primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
