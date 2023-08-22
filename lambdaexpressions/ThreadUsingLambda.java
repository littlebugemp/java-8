public class ThreadUsingLambda {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            Thread.currentThread().setName("My Thread");
            System.out.println(Thread.currentThread().getName() + " is running");
        };

        Thread myThread = new Thread(runnable);
        myThread.start();
    }

}
