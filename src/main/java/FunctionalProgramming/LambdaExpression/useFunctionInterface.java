package FunctionalProgramming.LambdaExpression;

import FunctionalProgramming.LambdaExpression.util.Adder;

import java.util.function.Function;

public class useFunctionInterface {

    /**
     * 이렇게 메서드를 객체화 시키기 위해 매번 메서드를 직접 만들기 불편함
     * 이를 해결하기 위해 람다 등장
     */

    public static void main(String[] args) {
        Function<Integer, Integer> myAdder = new Adder();
        int result = myAdder.apply(5);
        System.out.println("result = " + result);
    }
}
