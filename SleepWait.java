public class SleepWait {
    public static void main(String[] args) {
        SleepWait demo = new SleepWait();
        
        Thread t1 = new Thread(() -> demo.firstMethod());
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(() -> demo.secondMethod());
        t2.start();
    }

    public synchronized void firstMethod() {
        System.out.println("First method started");

        try {
            wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("First method finished");
    }

    public synchronized void secondMethod() {
        System.out.println("Second method started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Second method finished");
    }
}

