package challenge.thread;

public class Looper {

    // shared flag
    private volatile boolean stop = false;

    public static void main(String[] args) {

        Looper looper = new Looper();

        final Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                looper.stop = true;
                System.out.println("Thread 1 stopper: " + looper.stop);

            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        });

        final Thread thread2 = new Thread(() -> {
            try {
                while (!looper.stop) {
                    System.out.println("Thread 2 stopper: " + looper.stop);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        });

        thread1.start();
        thread2.start();
    }
}
