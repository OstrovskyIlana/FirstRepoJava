package firstTest;

import myFirstJava.Point;
import org.testng.Assert;
import org.testng.annotations.Test;
import secondJava.Square;

public class SquareTest {
   @Test
    public void testArea(){
        Square Lena = new Square(6);
       Assert.assertEquals( Lena.area(),36);
    }




    }

