package lab10;

import lab10.Task2.ArithmeticBaby;
import lab10.Task2.Calculation;
import lab10.Task3.Document;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public abstract class Main {

    public static void main(String[] args) {


        //region Task2
        ArithmeticBaby ab = new ArithmeticBaby();
        Calculation task22 = (a, b, c, d) -> pow(4 * sinh(sqrt(abs(a / b))) + 3 * asin(c), d);
        Calculation task23 = (a, b, c, d) -> (5 * c) / cos(a) + sqrt(sinh(abs(b) * c) / tan(d));
        Calculation task24 = (a, b, c, d) -> (cos(b) + sin(sqrt(a))) / (2 * log10(c) + pow(E, d));
        System.out.println("Task22: " + task22.calculate(1.23, -0.34, 0.707, 2.312));
        System.out.println("Task23: " + task23.calculate(-3.45, -2.34, 1.45, 0.83));
        System.out.println("Task24: " + task24.calculate(0.345, -2.25, 2.65, 3.99));
        //endregion

        //region Task3
        List<Document> pack = new ArrayList<>();
        pack.add(new Document("Minecraft"));
        pack.add(new Document("Universe"));
        pack.add(new Document("Space"));
        pack.add(new Document("Planet"));

        pack.forEach(System.out::println);
        //endregion


    }

}
