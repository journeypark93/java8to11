package me.test.java8to11;

import java.util.function.*;

public class JavaFunctionalInterface {

    public static void main(String[] args) {
        //2. JAVA 가 기본으로 제공하는 함수형 인터페이스
        // 2-1. Function<T, R> : T 를 넣었을 때, R 이 나온다.
        //Plus10 plus10 = new Plus10();
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10.apply(1));
        System.out.println(multiply2.apply(1));

        //2-1-1. Function<T, R> 에서
        //함수를 조합할 수 있는 메서드 (andThen, compose)
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        // multiply2 를 먼저 한 후, plus10 순서로 함.
        System.out.println(multiply2AndPlus10.apply(2));

        plus10.andThen(multiply2);
        //plus10 한 후, multiply2 의 입력값으로 씀.
        System.out.println(plus10.andThen(multiply2).apply(2));

        // 2-2. Consumer<T> : 받아서 입력값이 없음.
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        // 2-3. Supplier<T> : T 타입의 값을 제공하는 함수 인터페이스, 받아올 값의 타입을 정의함.
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10);

        // 2-4. Predicate<T> : 어떠한 인자 값을 하나 받아서, true false 를 return 하는 함수 인터페이스
        Predicate<String> startWithKeesun = (s) -> s.startsWith("keesun");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        // 2-5. UnaryOperator<T> : Function<T, R> 의 특수한 케이스(T, R 이 같을 때)
        UnaryOperator<Integer> plus11 = (i) -> i + 11;
        System.out.println(plus11.apply(1));

        // 2-6. BinaryOperator<T> : BiFunction<T, U, R> 의 특수한 케이스 (T, U, R 이 같을 때)
    }
}

