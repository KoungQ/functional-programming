package FunctionalProgramming.FunctionalInterface;

import java.util.function.Supplier;

public class useSupplier {
    public static void main(String[] args) {
        Supplier<String> myStringSupplier = () -> "Hello world";
        System.out.println("myStringSupplier = " + myStringSupplier.get());

        Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
        printRandomDoubles(myRandomDoubleSupplier, 3);
    }

    public static void printRandomDoubles(Supplier<Double> randomSupplier, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("randomSupplier = " + randomSupplier.get());
        }
    }
}
