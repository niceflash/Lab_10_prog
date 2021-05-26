package lab10.Task2;
import static java.lang.Math.*;


public class ArithmeticBaby {


    public ArithmeticBaby(){}

    public double Task22(double a, double b, double c, double d){
        double result = 0;

        result = pow(4 * sinh(sqrt(abs(a / b))) + 3 * asin(c), d);

        return result;
    }

    public double Task23(double a, double b, double c, double d){
        double result = 0;

        result = (5 * c) / cos(a) + sqrt(sinh(abs(b) * c) / tan(d));

        return result;
    }

    public double Task24(double a, double b, double c, double d){
        double result = 0;

        result = (cos(b) + sin(sqrt(a))) / (2 * log10(c) + pow(E, d));

        return result;
    }


}
