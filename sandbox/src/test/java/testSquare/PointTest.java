package testSquare;

import myFirstJava.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistance(){
        Point p1 = new Point(1,3);

        Point p2 = new Point(1,6);

        Assert.assertEquals( distance1(),3.0);
    }


}
