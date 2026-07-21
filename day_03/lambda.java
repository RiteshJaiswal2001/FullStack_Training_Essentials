package day_03;
interface Greeting {
    void sayHello();
}
interface Square {
    int findSquare(int n);
}

interface Add {
    int sum(int a, int b);
}

interface Message {
    void print(String name);
}

public class lambda {
    public static void main(String[] args) {

        // without lambda.
        // Greeting g = new Greeting() {
        //     @Override
        //     public void sayHello() {
        //         System.out.println("Hello Java");
        //     }
        // };

        // g.sayHello();

        //with lambda.

        Greeting g = () -> System.out.println("Hello Java");

        g.sayHello();

        // Lambda with One Parameter.

        Square s = n -> n * n;

        System.out.println(s.findSquare(5));

        // Lambda with Two Parameters

        Add add = (a, b) -> a + b;

        System.out.println(add.sum(10, 20));

        // Multiple Statements
        //When the lambda body has more than one statement, use {}.
        Message m = (name) -> {
            System.out.println("Welcome");
            System.out.println(name);
        };

        m.print("Ritesh");


    }
}
