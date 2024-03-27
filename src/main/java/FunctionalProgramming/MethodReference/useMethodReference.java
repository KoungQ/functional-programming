package FunctionalProgramming.MethodReference;

import FunctionalProgramming.MethodReference.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class useMethodReference {

    public static int calculate(int x, int y, BiFunction<Integer, Integer, Integer> operator) {
        return operator.apply(x, y);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public void myMethod() {
        System.out.println(calculate(10, 3, this::subtract));
    }

    public static void main(String[] args) {
        Function<String, Integer> str2int = Integer::parseInt;
        Integer result = str2int.apply("20");
        System.out.println("result = " + result);

        String str = "Hello";
        Predicate<String> equalsToHello = str::equals;
        System.out.println(equalsToHello.test("World"));

        // ClassName::staticMethodName
        System.out.println(calculate(8, 2, useMethodReference::multiply));

        // objectName::instanceMethodName
        useMethodReference instance = new useMethodReference();
        System.out.println(calculate(8, 2, instance::subtract));
        instance.myMethod();

        Function<String, Integer> strLength = String::length;
        Integer length = strLength.apply("hello world");
        System.out.println("length = " + length);

        BiPredicate<String, String> strEquals = String::equals;
        boolean helloEqualsWorld = strEquals.test("hello", "world");
        System.out.println("helloEqualsWorld = " + helloEqualsWorld);

        List<User> users = new ArrayList<>();
        users.add(new User(3, "Alice"));
        users.add(new User(1, "Charlie"));
        users.add(new User(2, "Bob"));

        // ClassName::instanceMethodName
        printUserField(users, User::getName);
    }

    public static void printUserField(List<User> users, Function<User, Object> getter) {
        for (User user : users) {
            System.out.println("getUser = " + getter.apply(user));
        }
    }
}
