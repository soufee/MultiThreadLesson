/**
 * Created by Shoma on 06.04.2017.
 */
public class EveryFiveSeconds implements Runnable {
    @Override
    public void run() {
       // Timer myTimer = new Timer();
        while (true) {
            int time =(int)Main.myTimer.seconds;
            if (time%5==0){
                if (time!=0)
                System.out.println("Кратно 5!");

                    synchronized (this) {

                        try {
                            wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }



        }}
    }
}
