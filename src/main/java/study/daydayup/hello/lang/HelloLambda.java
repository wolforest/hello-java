package study.daydayup.hello.lang;

import java.util.ArrayList;
import java.util.function.Consumer;

public class HelloLambda {
    public static void main(String[] args) {
        hello();
        helloConsumer();
    }

    public static void hello() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach(System.out::println);
    }

    public static void helloConsumer() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = System.out::println;
        numbers.forEach( method );
    }

}
