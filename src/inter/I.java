package inter;

@FunctionalInterface
public interface I {

   public default void m(){
        System.out.println("---iii m--call--");

    }

    static void n(){

    }

    void test();
}
