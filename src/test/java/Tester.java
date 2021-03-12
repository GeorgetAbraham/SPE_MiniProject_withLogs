import org.junit.*;
import static org.junit.Assert.*;

public class Tester {
    Calculator calc=new Calculator();
    private static final double delta=1e-3;
    @BeforeClass
    public static void preTest(){
        System.out.println("Going to start Calculator testing");
    }
//SQRT TESTING START
    @Before
    public void beforesqrttest(){
        System.out.println("Testing Square root");
    }

    @Test
    public void sqrt_truepositive(){
        System.out.println("Testing true positive cases for square root\n");
        assertEquals("sqrt of positive double number is failed",7.0710,calc.square_root(50.0),delta);
        assertEquals("sqrt of positive integer number is failed",11,calc.square_root(121),delta);
    }

    @Test
    public void sqrt_truenegative(){
        System.out.println("Testing true negative cases for square root\n");
        assertNotEquals("sqrt of positive double number is failed",-7.0710,calc.square_root(50.0),delta);
        assertNotEquals("sqrt of positive integer number is failed",11,calc.square_root(125),delta);
    }

    @After
    public void aftersqrttest(){
        System.out.println("Sqrt Testing done");
    }
//SQRT TESTING END

//    Factorial CLASS
@Before
public void beforeFCTRLtest(){
    System.out.println("Testing Factorial");
}

    @Test
    public void fctrl_truepositive(){
        System.out.println("Testing true positive cases for factorial\n");
        assertEquals("factorial of positive integer number is failed",120,calc.factorial(5),delta);
        assertEquals("factorial of 0 is failed",1,calc.factorial(0),delta);
        assertEquals("factorial of positive integer number is failed",5040,calc.factorial(7),delta);
    }

    @Test
    public void fctrl_truenegative(){
        System.out.println("Testing true negative cases for factorial\n");
        assertNotEquals("factorial of positive integer number is failed",-7.0710,calc.factorial(50),delta);
        assertNotEquals("factorial of positive integer number is failed",8,calc.factorial(3),delta);
    }

    @After
    public void aftersFCTRLtest(){
        System.out.println("Factorial Testing done");
    }

//FACTORIAL CLASS END

//    Exponentiation start
@Before
public void beforePowtest(){
    System.out.println("Testing Power function");
}

    @Test
    public void pow_truepositive(){
        System.out.println("Testing true positive cases for power function\n");
        assertEquals("power of both positive integer number is failed",8,calc.power(2,3),delta);
        assertEquals("power to 0 is failed",1,calc.power(10,0),delta);
        assertEquals("power of positive double number is failed",162.60265,calc.power(3.1,4.5),delta);
        assertEquals("power of base positive number,power negative is failed",0.27725,calc.power(2.5,-1.4),delta);
        assertEquals("power of negative with base 0 failed",Double.POSITIVE_INFINITY,calc.power(0,-1),delta);
    }

    @Test
    public void pow_truenegative(){
        System.out.println("Testing true negative cases for power function\n");
        assertNotEquals("power of both negative integer number is failed",-7,calc.power(-2,-2),delta);
        assertNotEquals("power of positive double number is failed",8.1,calc.power(2.0,3.0),delta);
    }

    @After
    public void aftersPowtest(){
        System.out.println("Power function Testing done");
    }
    @Before
    public void beforeLogtest(){
        System.out.println("Testing Log function");
    }

    @Test
    public void log_truepositive(){
        System.out.println("Testing true positive cases for log\n");
        assertEquals("log of positive double number is failed",0.8329091229351039,calc.naturallog(2.3),delta);
        assertEquals("log of positive integer number is failed",2.3025,calc.naturallog(10),delta);
    }
    @Test
    public void log_truenegative(){
        System.out.println("Testing true negative cases for Log\n");
        assertNotEquals("Log of positive double number is failed",-7.0710,calc.naturallog(50),delta);
        assertNotEquals("Log of positive integer number is failed",8,calc.naturallog(3),delta);
    }


    @After
    public void aftersLogtest(){
        System.out.println("Log function Testing done");
    }


//    exponentiation end


    @AfterClass
    public static void postTest(){
        System.out.println("Calculator Testing Done");
    }

}
