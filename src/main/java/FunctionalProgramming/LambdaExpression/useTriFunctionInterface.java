package FunctionalProgramming.LambdaExpression;

import FunctionalProgramming.LambdaExpression.util.TriFunction;

public class useTriFunctionInterface {

    /**
     * 파라미터가 세 개 이상이 필요한 경우 직접 만들어야 함
     */

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (x, y, z) -> x + y + z;

        int result = addThreeNumbers.apply(3, 2, 5);
        System.out.println("result = " + result);
    }
}
