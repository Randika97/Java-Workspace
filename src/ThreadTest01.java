//Definig a thread
public class ThreadTest01 extends Thread {

    public void run(){

        //Job of the thread

        //executed by child thread
        for (int i = 0; i<10; i++){
            System.out.println("Child Tread");
        }
    }

}
