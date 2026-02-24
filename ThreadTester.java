package MultiThreading;

public class ThreadTester extends Thread {
    public void run(){
        try{
            System.out.println("in run "+ getState());
            sleep(3000);
            System.out.println("Thread is Running");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void main() throws Exception{
        ThreadTester tester = new ThreadTester();
        System.out.println(tester.getState());
        tester.start();
        //tester.join();
        Thread .sleep(5000);
        System.out.println(tester.getState());

        System.out.println("Ending of main thread");
        System.out.println(tester.getState());
    }
}