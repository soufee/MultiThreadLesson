import java.util.Date;

/**
 * Created by Shoma on 06.04.2017.
 */
public class Timer implements Runnable{
Date datestart = new Date();
   static long seconds;
     public Timer()
    {

    }

    @Override
    public void run() {
while (true){
        try {

               Date dateNow = new Date();
            seconds =  (( dateNow.getTime() - datestart.getTime())/1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     }
}
