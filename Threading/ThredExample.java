public class ThredExample {
    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }   
}


class MyThread extends Thread {
    private String threadname;
    public MyThread(String s){
        this.threadname = s;
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(threadname+ " "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(threadname+  "interrupted");
            }
        }
    }
}