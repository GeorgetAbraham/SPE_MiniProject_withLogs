import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Calculator{
//    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private static final Logger logger;

    static {
        logger = LogManager.getLogger(Calculator.class);
    }

    public float add(float a,float b){
        return a+b;
    }
    public float divide(float a,float b){
        return a/b;
    }

    public static int factorial(int x) {
        logger.info("Factorial for number: "+x);
        if (x == 0 || x==1) {
            return 1;
        }
        if(x>1){
            return x*factorial(x-1);}
        else {
            throw new ArithmeticException("The entered number is negative,no factorial defined");
        }
    }

    public static void main(String[] args){
        System.out.println("Hello friend");
        System.out.println("How are you?");
        int a;
        Scanner obj=new Scanner(System.in);
        boolean state=true;
        while(state){
            System.out.println("Enter any of the following options to perform related operations");
            System.out.println("1.Square Root");
            System.out.println("2.Factorial Function");
            System.out.println("3.Natural Log");
            System.out.println("4.Exponentiation");
            System.out.println("5.Exit Calculator");
            a=obj.nextInt();
            if(a==1){
                System.out.println("Enter number for which to find square root\n");
                double x=obj.nextDouble();
                System.out.println(Math.sqrt(x));
                logger.info("Exponentiation for the number : "+x);
            }
            else if(a==2){
                System.out.println("Enter number for which to find Factorial\n");
                int x=obj.nextInt();
                System.out.println(factorial(x));
//                break;
            }
            else if(a==3){
                System.out.println("Enter number for which to find log\n");
                double x=obj.nextDouble();
                System.out.println(Math.log(x));
                logger.info("Natural log for number: "+x);
            }
            else if(a==4){
                System.out.println("Enter numbers x and b for exponentiation\n");
                double x,b;
                x=obj.nextDouble();
                b=obj.nextDouble();
                System.out.println(Math.pow(x,b));
                logger.info("Exponentiation of: "+x+" with "+b);
            }
            else{
                state=false;
                break;
            }


        }


    }



}
