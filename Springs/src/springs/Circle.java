package springs;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements shape {

	private Point center;

	public Point getCenter() {
		return center;
	}
@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
	
public void draw(){
		System.out.println("center is : ( "+center.getX() + "," +center.getY() +" )");
}
	
}
