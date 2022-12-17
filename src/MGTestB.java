public class MGTestB {
    public static void main(String[] args) {
        //A a = new A(); // invalid
        //A a = new B(); // valid
        //B b = new A(); // not valid
        //B b = new  A(){};// valid
        //A a = new A(){};// valid
        Runnable x = new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        };
        Something something = new Something();
        System.out.print(something.add(1,2,3,4));
        System.out.print(something.add(1,2,3));
        System.out.print(something.add(1,2));
        System.out.print(something.add(1,2,3,4));
        System.out.print(something.add());
        System.out.println(something.add(1,2,3,3,5,6,7,8,9));

    }
}


class Something {

    int add(int a, int b, int c) {
        //stmt1
        return 3;
    }

    int add(int a, int b, int c,int d) {
        //stmt1
        return 4;
    }

    int add(int a, int b) {
//stmt2
        return 2;
    }

    int add(int... a) {
        return 8;
    }
   /* int add(int... a,int x) {
        return 5;
    }*/
   /* int add(int x, int... a) {
        return 52;
    }*/
}


class B implements A
{

}
interface  A{


}

/*
class Student
{
    int rollNo;



}

class StudentComparator<Student> implements Comparator
{

    int compare(Student obj1,Student obj2)
    {
        return obj1.getRollNo()-obj2.getRollNo();

    }


}*/
 //5 1 6 4

         /*StudentComparator comp=new StudentComparator();

         Map<Student,Object> map=new TreeMap(comp)

        Inorder Traversal  Left root right*/
            /*5
        1        6
            4


        1 4 5 6*/