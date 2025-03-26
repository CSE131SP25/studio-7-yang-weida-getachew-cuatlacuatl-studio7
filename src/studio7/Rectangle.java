package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double width;
	private double height;
	private double area;
	private double perimeter;
	private boolean square;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
//		this.area = area;
//		this.perimeter = perimeter;
//		this.square = square;
	}
	
	public double area() {
		return this.width*this.height;
	}
	
	public double perimeter() {
		return (2*this.width)+(2*this.height);
	}
	
	public boolean square() {
		if (this.width == this.height) {
			return true;
		} else {
			return false;
		}
	}
	
	public String compare(Rectangle other) {
		if (this.area() > other.area()) {
			return "Greater than";
		} else if (this.area() < other.area()) {
			return "Less than";
		} else {
			return "Equal to";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle((Math.random()*2 + 7), (Math.random()*2 + 7));
		Rectangle s = new Rectangle((Math.random()*2 + 7), (Math.random()*2 + 7));
		
		System.out.println(r.area());
		System.out.println(s.area());
		System.out.println(r.compare(s));
		

	}

}
