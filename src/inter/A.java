package inter;

import java.io.FileNotFoundException;

abstract class Parent {


    void text() {

        System.out.println("-----test------");
    }

    public static void stat_m() {
        System.out.println("---------parent static-");
    }
    //abstract void parem_m();

}

public class A extends Parent implements I, J {

    A() {

    }

    public static void stat_m() {
        System.out.println("---------child static-");
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Parent.text();
        A a = new A();
        a.m();
        //A.text();


        A.stat_m();



        /*Supplier<String> x = () -> "Manazir";
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

        TriFunction<String,String ,String,Integer> func4 = (n,m,p) ->(n+m+p).length();
        func4.apply("GG","KK","PP");
        KuchBi k = () -> System.out.println("test");

        try(FileInputStream fis = new FileInputStream(new File("D:\\"))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }*/

    }


    @Override
    public void m() {
        I.super.m();
    }

    @Override
    public void test() {

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


    public enum MyEnum {
        MONDAY,
        TUESDAY,
        WEDNESDAY


    }
}
