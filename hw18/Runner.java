package edu.dmacc.codedsm.hw18;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {

        Function<String,Integer> stringToIn = s -> s.length();
        System.out.println(stringToIn.apply("Nate Buwalda"));

        BiFunction<String,String,Integer> stringsToInt = (r, s) -> r.length() + s.length();
        System.out.println(stringsToInt.apply("Cody","karemera"));

        Consumer<String> useString = s -> System.out.println(s);
        useString.accept("consume");

        Supplier<String> makeString = () -> "Hello";
        System.out.println(makeString.get());

    }
}
