package FunctionalProgramming.LambdaExpression;

import java.util.function.BiFunction;

public class useBiFunctionInterface {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        int result = add.apply(3, 5);
        System.out.println("result = " + result);
    }
}
