package oops.interfac;


@FunctionalInterface
public interface J {

    default void m(){
        System.out.println("---jjj m()-----");
    }

    static void n(){
    }

    void test();


}
