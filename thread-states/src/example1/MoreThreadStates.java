package example1;

/**
 * Created by alexg on 21.09.2014.
 */
public class MoreThreadStates {
    public static void main(String[] args) {
        Thread t1 = new SleepyThread();
        Thread t2 = new SleepyThread();
        t1.start();
        t2.start();
        System.out.println(t1.getName() + ": I'm in state " + t1.getState());
        System.out.println(t2.getName() + ": I'm in state " + t2.getState());
        //Thread-0: I'm in state TIMED_WAITING
        //Thread-1: I'm in state BLOCKED
        // the output can vary

    }
}
