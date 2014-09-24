package example3;

public class ThreadStatesEnumeration {
    public static void main(String []s) {
        for(Thread.State state : Thread.State.values()){
            System.out.println(state);
        }
        /*
        It prints the following:

        NEW
        RUNNABLE
        BLOCKED
        WAITING
        TIMED_WAITING
        TERMINATED
        */
    }
}
