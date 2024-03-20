package FunctionalProgramming.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class useBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Double> myDoubleProcessor =
                (Integer index, Double input) -> System.out.println("Processing " + input + " at index " + index);

        List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3);
        process(inputs, myDoubleProcessor);
    }

    public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
        for(int i = 0; i < inputs.size(); i++) {
            processor.accept(i, inputs.get(i));
        }
    }
}
