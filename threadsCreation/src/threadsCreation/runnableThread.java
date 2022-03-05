package threadsCreation;

public class runnableThread implements Runnable{
	 
    public static int myCount = 0;
    public runnableThread(){
         
    }
    public void run() {
        while(runnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++runnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runnableThread mrt = new runnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(runnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++runnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
