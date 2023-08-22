package functional_interfaces;

public class Example {
    public static void main(String[] args) {
        //lambda expression
        new Thread(()->{
            System.out.println("I am Thread1");
        }).start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Thread2");
            }
        });
        thread.start();
        Task task = new Task("Thread3");
        Thread thread3 = new Thread(task);
        thread3.start();

        //functional Interface
        FunctionalI functionalI = (s)-> s.toLowerCase();
        System.out.println(functionalI.sayMessage("Hey Ankush"));

    }

    static class Task implements Runnable{
        String name;
        Task(String name){
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println("I am "+name);
        }
    }

    interface FunctionalI{
        String sayMessage(String s);
    }
}
