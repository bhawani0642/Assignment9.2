
public class Circle extends Main {
	double pie=3.14;
	Double area;
	
	double dem1=4.00;
	double perimeter;
	// overrided the FindArea method
	@Override
	public double findArea() {
		area= pie*(dem1*dem1);
		
		// TODO Auto-generated method stub
		return area;
	}
	//overrided the findPerimeter method
	@Override
	public double findPerimeter() {
		perimeter= 2*(pie)*dem1;	
		// TODO Auto-generated method stub
		return perimeter;
	}

}

