import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        MinhaThread t = new MinhaThread();
        MinhaThread t2 = new MinhaThread();
        t.start();
        t2.start();

        try{
            t.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MinhaThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {  
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}