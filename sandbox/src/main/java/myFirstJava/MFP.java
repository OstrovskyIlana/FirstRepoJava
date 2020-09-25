package myFirstJava;

public class MFP {
	public static void main(String[] args) {

		Point p1 = new Point(1,3);

		Point p2 = new Point(1,6);

		/*Point p1 = new Point();

		Point p2 = new Point();

		p1.x = 1;

		p1.y = 3;

		p2.x= 1;

		p2.y = 6;
*/
		System.out.println("Point p1 found there: x = " + p1.x + " у = " + p1.y);

		System.out.println("Point p2 found there: x = " + p2.x + " у = " + p2.y);


		System.out.println(Point.distance1(p1,p2));

		//System.out.println(Point.distance2(p1,p2));

	}


}


