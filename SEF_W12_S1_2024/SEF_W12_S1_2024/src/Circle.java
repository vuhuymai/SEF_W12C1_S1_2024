import java.awt.Graphics;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public void draw(Graphics g) {
		// Write code here to draw the Circle
	}
	
	@Override
	public void move(int x, int y) {
		// Write code to move a circle to a new location
	}
	
}
