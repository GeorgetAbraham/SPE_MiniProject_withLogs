import org.junit.*;
import static org.junit.Assert.*;

public class Tester {
    @BeforeClass
    public static void predivtest(){
        System.out.println("Going to start division testing");
    }

    @Before
    public void beforetest(){
        System.out.println("Testing Division");
    }

    @Test
    public void bothpostest(){
        System.out.println("Both are positive");
        Calculator calc=new Calculator();
        assertEquals("division of 20.2 and 10.1 is not working correctly",2.0,calc.divide(20.2f, 10.1f),0.00001);
    }

    @Test
    public void onepostest(){
        System.out.println("Only one is negative\n");
        Calculator calc=new Calculator();
        assertEquals("division of 1.21 and -1.1 is not working correctly",-1.1,calc.divide(1.21f, -1.1f),0.00001);
    }

    @Test
    public void bothnegtest(){
        System.out.println("Both are negative\n");
        Calculator calc=new Calculator();
        assertEquals("division of -4.0 and -2.0 is not working correctly",2.0,calc.divide(-4.0f, -2.0f),0.00001);
    }

    @Test
    public void Factorialtest(){
        System.out.println("Testing factorial\n");
        Calculator calc=new Calculator();
        assertEquals("Factorial of 5 not proper",120,calc.factorial(5));
    }


    @After
    public void aftertest(){
        System.out.println("Division Testing done");
    }
    @AfterClass
    public static void postdivtest(){
        System.out.println("Division Class Testing Done");
    }

}
