package myFirstJava;

public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
   }


    public static double distance1(Point p1,Point p2)
    {
        int dx = p2.x - p1.x;

          int dy = p2.y - p1.y;

          return Math.sqrt(dx*dx + dy*dy);

        }

  /*  public static double distance2(Point p1,Point p2)
         {
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)-(p2.y - p1.y)*(p2.y - p1.y));
  */  }
