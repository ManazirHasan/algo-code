package streamapi;

import oops.interfac.A;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOnFunctionProg {

    public static void main(String[] args) {


        Supplier<String> x = () -> "Manazir";
        System.out.println(x.get());

        Supplier<Boolean> y=  () -> false;
        System.out.println(y.get());

        Consumer<Integer> z = n -> System.out.println(n*10);
        z.accept(5);

        BiConsumer<Integer,Integer> z2 = (n, m) -> System.out.println(n*10+m*20);
        z2.accept(5,3);

        Predicate<String> pred= n -> n.length()>5 ;
        pred.test("Arshad");

        List<String> names = new ArrayList<>();
        Predicate<String> pred2= s ->s.equalsIgnoreCase("arshad");


        Stream<String> strm = names.stream().filter( pred2);
        strm.collect(Collectors.toList());

        Function<String,Integer> func = n -> n.length();
        func.apply("Arshad");

        Function<String,String> func2 = n ->n.toUpperCase();
        func2.apply("Arshad");


        BiFunction<String,String ,Integer> func3 = (n,m) ->(n+m).length();
        func3.apply("Manazir ","Arshad");

        TriFunction<String,String ,String,Integer> func4 = (n, m, p) ->(n+m+p).length();
        func4.apply("GG","KK","PP");
        KuchBi k = () -> System.out.println("test");

        try(FileInputStream fis = new FileInputStream(new File("D:\\"))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }
}


@FunctionalInterface
interface TriFunction<T, U, V, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     */
    R apply(T t, U u, V v);
}

interface KuchBi {

    void m();
    // void n();

}

class Test implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}


enum MyEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY


}
