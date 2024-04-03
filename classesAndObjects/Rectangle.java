package classesAndObjects;

// Classes should practice encapsulation- make fields private and the methods that are used public
public class Rectangle {

	private double length;
	private double width;
	
	//Example of constructors- initialize an obj, no return time because they are not a method
	public Rectangle() { //defaul constructor assigns default values to fields
		length = 0;
		width = 0;
	}
	
	//second constructor example 
	public Rectangle(double length, double width) {
		this.length = length; //can be set this way
		setWidth(width); //or can be set this way. only diff to demo alternative options
	}
	
	//Getter and setter methods
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		// the 'this' here is used to specify that the initial length, is the global variable that we are equating to the new variable length
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double calculatePerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public double calculateArea() {
		return length * width;
	}
	
}
