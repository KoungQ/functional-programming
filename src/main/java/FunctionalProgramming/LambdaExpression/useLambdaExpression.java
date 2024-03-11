package FunctionalProgramming.LambdaExpression;

import java.util.function.Function;

public class useLambdaExpression {

    /**
     * 람다식은 메서드 이름이 따로 존재하지 않고, myAdder는 이름없는 메서드를 담는 상자일 뿐이다.
     *
     * 매개변수의 타입이 유추 가능할 경우 타입 생략 가능
     * 매개변수가 하나일 경우 괄호 생략 가능
     * 바로 리턴하는 경우 중괄호 생략 가능
     *
     * 기존 코드
     *      Function<Integer, Integer> myAdder = (Integer i) -> {
     *             return i + 10;
     *         };
     *
     * 단순화 작업 후
     *      Function<Integer, Integer> myAdder = i -> i + 10;
     */

    public static void main(String[] args) {
        Function<Integer, Integer> myAdder = i -> i + 10;

        int result = myAdder.apply(5);
        System.out.println("result = " + result);
    }
}
