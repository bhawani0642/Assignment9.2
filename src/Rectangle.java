//this is Rectangle class it extends our main class
public class Rectangle extends Main {
	double dem1=7.00;
	double dem2=4.50;
	double area;
	double perimeter;
	// overrided the FindArea method
	@Override
	public double findArea() {
		area= dem1*dem2;
		return area;
		
		// TODO Auto-generated method stub
		
	}
	//overrided the findPerimeter method
	@Override
	public double findPerimeter() {
		perimeter=(2*(dem1)+2*(dem2));
		return perimeter;
		
		// TODO Auto-generated method stub
		
	}
	

}
