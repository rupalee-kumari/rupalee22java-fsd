class MyThread extends Thread {
    public void run() {
        int i=0;
        while(i<400){
            System.out.println("my thread running");
            i++;
        }
    }
}

public class multithreading {
        public static void main (String args[]){
        MyThread t1 = new MyThread();
        t1.start();  // Start the first thread

        MyThread t2 = new MyThread();
        t2.start();  // Start the second thread
    }
    }



