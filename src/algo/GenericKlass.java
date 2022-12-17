package algo;

import static java.awt.PageAttributes.MediaType.B1;

public class GenericKlass {

    public static void main(String[] args) {
        System.out.println("-----------All the best---------");
        A1<C1> a = new A1();
        a.m(null);

        C1 c1 = new C1();
        A1<C1> a1 = new A1();
        a1.m(c1);
    }
}

//Note it not gives proper result
/*class A1<? super B1>  {
    void m(T t ){
        System.out.println("--------------");
    }
}*/

class A1<T extends  C1>  {
        void m(T t ){
        System.out.println("--------------");
        }
        }

class B1<T> {
}

class C1<T> extends B1<T> {
}
