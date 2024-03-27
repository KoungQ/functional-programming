package FunctionalProgramming.MethodReference;

import FunctionalProgramming.MethodReference.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class useConstructorReference {
    public static void main(String[] args) {
        Map<String, BiFunction<String, String, Car>> carTypeToConstructorMap = new HashMap<>();
        carTypeToConstructorMap.put("sedan", Sedan::new);
        carTypeToConstructorMap.put("suv", Suv::new);
        carTypeToConstructorMap.put("van", Van::new);

        BiFunction<Integer, String, User> userCreator = User::new;
        User Alice = userCreator.apply(3, "Alice");
        System.out.println("Alice = " + Alice);

        String[][] inputs = new String[][] {
                { "sedan", "Sonata", "Hyundai" },
                { "van", "Sienna", "Toyota" },
                { "sedan", "Model S", "Tesla" },
                { "suv", "Sorento", "KIA" }
        };

        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < inputs.length; i++) {
            String[] input = inputs[i];
            String carType = input[0];
            String carName = input[1];
            String carBrand = input[2];

            cars.add(carTypeToConstructorMap.get(carType).apply(carName, carBrand));
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}
