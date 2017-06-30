//This is the main class containing main method
public class MainClass {

	public static void main(String[] args) {
		/*
		 * Now we create the object of all three classes Circle,Rectangle and Triangle and
		 * then we call the methods to find area and perimeter for each classes and the using 
		 * printline we print it
		 */
		
		Circle cr= new Circle();
		cr.findArea();
		System.out.println("Area of the circle is ="+cr.area);
		cr.findPerimeter();
		System.out.println("Perimeter of the circle is ="+cr.perimeter);
		Rectangle rr= new Rectangle();
		rr.findArea();
		System.out.println("Area of the rectangle is ="+rr.area);
		rr.findPerimeter();
		System.out.println("Perimeter of the rectangle is = "+rr.perimeter);
		Triangle tr= new Triangle();
		tr.findArea();
		System.out.println("Area of the triangle is ="+tr.area);
		tr.findPerimeter();
		System.out.println("Perimeter of the triangle is = "+tr.perimeter);
		

	}

}
