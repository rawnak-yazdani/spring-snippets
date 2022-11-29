import io.welldev.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.*;

public class Test1 {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        assertEquals(5, calculator.add(2, 3));
//        Assert.assertEquals();

    }
}
