//this is Triangle class it extends our main class
public class Triangle extends Main
{
	//dem1
	double dem1=2;
	double dem2=4;
	double dem3=6;
	double area;
	double perimeter;
	// overrided the FindArea method
	@Override
	public double findArea() {
		area=0.5*dem1*dem2;
		return area;
		
		
	}
	//overrided the findPerimeter method
	@Override
	public double findPerimeter() {
		perimeter=dem1+dem2+dem3;
		
		// TODO Auto-generated method stub
		return  perimeter;
	}
	

}
