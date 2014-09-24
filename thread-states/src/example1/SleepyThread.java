package example1;

//timed_waiting and blocked states
public class SleepyThread extends Thread{
    @Override
    public void run() {
        synchronized (SleepyThread.class){
            try{
                Thread.sleep(10000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
