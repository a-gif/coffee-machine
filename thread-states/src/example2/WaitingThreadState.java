package example2;

/**
 * Created by alexg on 21.09.2014.
 */
public class WaitingThreadState {
    public static void main(String []s) throws InterruptedException {
        Thread t = new InfiniteWaitThread();
        t.start();
        System.out.println(t.getName() + ": I'm in state " + t.getState());
        Thread.sleep(5000);
        System.out.println(t.getName() + ": I'm in state " + t.getState());
        //Thread-0: I'm in state RUNNABLE and then WAITING
        //Used the timeout because the state was not correctly reflected
    }
}
