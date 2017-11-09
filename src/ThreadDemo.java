public class ThreadDemo {

    //main thread
    public static void main(String[] args) {

        //thread instantiation
        ThreadTest01 thread01 = new ThreadTest01();
        //starting of a thread (main thread starts a child thread)
        thread01.start();

        //main thread is responsible to run this code while the child thread is responsible to
        //run method in TreadTest01

        //executed by main thread
        for (int i =0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
