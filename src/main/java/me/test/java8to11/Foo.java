package me.test.java8to11;


public class Foo {

    public static void main(String[] args) {
        //1. 함수형 인터페이스 설명
//        RunSomething runSomething =  new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//                System.out.println("Lambda");
//            }
//        };
//        //익명내부클래스를 람다로 간편하게 표현 가능
//        RunSomething runSomething1 = () -> {
//            System.out.println("Hello");
//            System.out.println("Lambda");
//        };
//        //함수 사용도 가능
//        //람다는 특수한 형태의 object임. 함수형인터페이스를 인라인으로 구현한 object
//        RunSomething runSomething2 = () -> System.out.println("Hello2");
//        runSomething2.doIt();
//    }

        // 특징.
//        //같은 값을 넣을 때, 같은 값이 나오도록 보장이 되어야 함.
//
//        RunSomething runSomething = (number) -> {
//            return number + 10;
//        };
//
//        System.out.println(runSomething.doIt(1));
//        System.out.println(runSomething.doIt(1));
//        System.out.println(runSomething.doIt(1));
//        System.out.println(runSomething.doIt(2));
//        System.out.println(runSomething.doIt(2));
//        System.out.println(runSomething.doIt(2));

        // 보장되지 않는 경우? 1) 함수 밖에서 값을 할당해서 쓰는 경우, 상태값을 가지고 있다. pure 한 함수라고 볼 수 없다. 상태값에 의존한다.
        //(final) int baseNumber = 10;

        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;

            @Override
            public int doIt(int num) {
                //2) 외부값을 변경하는 행위. pure 한 함수라고 볼 수 없다.
                baseNumber++;
                return num + baseNumber;
            }
        };

        //이건 안됨-> baseNumber++;
    }
}

