package oops.interfac;

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




    }


    @Override
    public void m() {
        I.super.m();
    }

    @Override
    public void test() {

    }


}
