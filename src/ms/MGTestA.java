package ms;
import java.util.ArrayList;
import java.util.List;

public class MGTestA {

    public static void main(String[] args) {
        System.out.println("----------------");
    }
}

/*class SingletonLazyAndThreadSafe {

    private static final SingletonLazyAndThreadSafe INSTANCE1 = new SingletonLazyAndThreadSafe();

    private SingletonLazyAndThreadSafe () {
    }

    public static SingletonLazyAndThreadSafe getInstance() {
        //Thread.sleep(1000);
        return Inner.INSTANCE;
    }

    public int division(int i, int j) throws InterruptedException{
        if(Objects.nonNull(j)) {
            return i/j;
        } else {
            throw new NullPointerException();
        }

    }

    static class Inner {
        private static final SingletonLazyAndThreadSafe INSTANCE = new SingletonLazyAndThreadSafe();//Bill plough
    }

    public static void main(String[] args) {

//		SingletonLazyAndThreadSafe.getInstance().division(1, 0);

//		ExecutorService es = Executors.newFixedThreadPool(5);
//		for(int i=0; i<4; i++) {
//			es.submit(()-> {
//				try {
//					System.out.println(SingletonLazyAndThreadSafe.getInstance().hashCode());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			});
//		}
//		es.shutdown();
    }
}*/

final class Student {

    private final int sId;
    private final List<Integer> ints;

    public Student(int sId, List<Integer> ints) {
        super();
        this.sId = sId;
        this.ints = ints;

    }

    public int getsId() {
        return sId;
    }

    public List<Integer> getInts() {
        List<Integer> listCopy = new ArrayList<>();
        for(int i: ints) {
            listCopy.add(i);
        }
//		return Collections.unmodifiableList(listCopy);
        return listCopy;
    }
}
