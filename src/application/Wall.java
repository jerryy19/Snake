package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * 
 * 
 * 
 */

public class Wall extends Pane implements Sprite {
	
	private Rectangle _rContainer;		// outline box(unnecessary)
	private int _width, _height;		// width / height of Wall
	private String _name;				// name of Wall
	Image wall;
	ImageView imgWall;
	
	Wall(String name) {
		
		_width = 25;
		_height = 25;
		_name = name;
		draw();
		
	}
	
	@Override
	public void draw() {
		wall = new Image(getClass().getResourceAsStream("\\assets\\wall.png"));
		imgWall = new ImageView(wall);
		imgWall.setFitWidth(25);
		imgWall.setFitHeight(25);
	}
	
	@Override
	public void show() {
//		_r = new Rectangle(_width, _height);
//		_r.setFill(Color.RED);
		getChildren().add(imgWall);
	}
	
}