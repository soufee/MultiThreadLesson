/**
 * Created by Shoma on 06.04.2017.
 */
public class EverySecond implements Runnable {


    @Override
    public void run() {
        while (Main.timer>0){
            try {

                Main.timer--;
                synchronized (this) {
                    if (Main.myTimer.seconds!=0)
                    System.out.println(Main.myTimer.seconds);


                    wait(1000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }}
    }

