package me.test.java8to11;

@FunctionalInterface
public interface RunSomething {

    //추상 메서드가 하나만 있으면, 함수형 인터페이스
    //interface에서는 abstract 생략 가능
    int doIt(int num);

    //static method 정의 가능
    //public 생략가능
    static void printName(){
        System.out.println("Jiyeon");
    }

    //default method 정의 가능
    default void printAge(){
        System.out.println("30");
    }
}
