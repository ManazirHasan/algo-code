package ms;

public class ThreadTest {


    //This method performs some task and takes 2 seconds to execute completely
    public synchronized void printA() {
        //perform some task
    }

    //This method performs some task and takes 2 seconds to execute completely
    public synchronized void printB() {
            //perform some task
    }

    //This method performs some task and takes 3 seconds to execute completely
    public static synchronized void printC() {
            //perform some task
    }
}


