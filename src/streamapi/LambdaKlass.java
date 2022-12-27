package streamapi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaKlass implements I1,I2 {

    public static void main(String[] args) {
        System.out.println("----Hello ---");

        Supplier s = ()-> 3; //only return values- get(),accept(),
        System.out.println(s.get());

        Consumer<Integer> c = (x)-> System.out.println(x+3) ;
        c.accept(3);

        Predicate<String> p = ( k ) -> k.equalsIgnoreCase("Hi");
        p.test("Hi How are you");

        Function<String ,Integer> fun=    (f) -> f.length();
        System.out.println(fun.apply("Checking String lenght"));

    }

    @Override
    public void m() {
        //I2.super.m();
        m();
    }
}

interface I1 {
    default  void m(){}
}

interface I2 {
    default void m(){}
}
