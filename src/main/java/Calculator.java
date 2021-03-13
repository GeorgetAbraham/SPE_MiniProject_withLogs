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

    public int factorial(int x){
//        logger.info("Factorial for number: "+x);
        if (x == 0 || x==1) {
            return 1;
        }
        if(x>1){
            return x*factorial(x-1);}
        else {
//            logger.error("Factorial not defined for negative number :"+x);
            throw new ArithmeticException("The entered number is negative,no factorial defined");
        }
    }

    public double naturallog(double x){

        logger.info("[LOG] - "+x);
        if(x<=0){
//            logger.info("[Log of : "+x+"]");
            logger.error("[LOG-ERROR] - 0");
            throw new ArithmeticException("Log of non positive numbers undefined");
        }

        double y=Math.log(x);
        logger.info("[LOG-RESULT] - "+y);
        return y;
    }

    public double square_root(double x){
        logger.info("[SQRT] - "+x);
        double y = Math.sqrt(x);
        logger.info("[SQRT-RESULT] - "+y);
        return y;
    }

    public double power(double x,double y){
        logger.info("[POW] - "+x+", "+y);
        if(x==0 && y==0){
            logger.error("[POW-ERROR] - 0");
            throw new ArithmeticException("0 power 0 not defined");
        }
        else{
            double h=Math.pow(x,y);
            logger.info("[POW-RESULT] - "+h);
//            logger.info("Result of power "+Math.pow(x,y)+"]");
            return h;
        }
    }



    public static void main(String[] args){
        System.out.println("Hello friend");
        System.out.println("How are you?");
        int a;
        Scanner obj=new Scanner(System.in);
        boolean state=true;
        Calculator c=new Calculator();
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
                try{
                    double y=c.square_root(x);
                    System.out.println(y);
                }
                catch(ArithmeticException e){
                    System.out.println(e);
                }

//                logger.info("Exponentiation for the number : "+x);
            }

            else if(a==2){
                System.out.println("Enter number for which to find Factorial\n");
                int x=obj.nextInt();
                logger.info("[FACTORIAL] - "+x);
                try{
                    int y=c.factorial(x);
                    System.out.println(y);
                    logger.info("[FACTORIAL-RESULT] - "+y);
                }
                catch(ArithmeticException e){
                    logger.error("[FACTORIAL-ERROR] - 0");
                    System.out.println(e);
                }
//                break;
            }

            else if(a==3){
                System.out.println("Enter number for which to find log\n");
                double x=obj.nextDouble();
                try{
                    double y=c.naturallog(x);
                    System.out.println(y);
                }
                catch (ArithmeticException e){
                    System.out.println(e);
                }

//                logger.info("Natural log for number: "+x);
            }
            else if(a==4){
                System.out.println("Enter numbers x and b for exponentiation\n");
                double x,b;
                x=obj.nextDouble();
                b=obj.nextDouble();
                try{
                    System.out.println(c.power(x,b));
                }
                catch(ArithmeticException e){
                    System.out.println(e);
                }

//                logger.info("Exponentiation of: "+x+" with "+b);
            }
            else{
                logger.info("[EXIT] - 1");
                state=false;
                break;
            }


        }


    }
}
