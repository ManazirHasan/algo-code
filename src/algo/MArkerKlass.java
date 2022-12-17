package algo;

public class MArkerKlass {
    public static void main(String[] args) {
        System.out.println("------------");
        I i = new AM();
        if (i instanceof I) {
            System.out.println("---iii--");
        }if (i instanceof AM) {
            System.out.println("---AM--");
        }
    }

}

class AM implements I{


}
interface I{

}
