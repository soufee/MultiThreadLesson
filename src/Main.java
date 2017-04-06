/**
 * Created by Shoma on 06.04.2017.
 */
public class Main {
    public static int timer = 25;
    public static Timer myTimer;
    public static EverySecond everySecond;
public static EveryFiveSeconds everyFiveSeconds;
    public static void main(String[] args) throws InterruptedException {
        myTimer = new Timer();
        everySecond = new EverySecond();
        everyFiveSeconds = new EveryFiveSeconds();
        Thread timeThread = new Thread(myTimer);
        Thread threadSeconds = new Thread(everySecond);
        Thread threadForFiveSeconds = new Thread(everyFiveSeconds);

        timeThread.start();
        threadSeconds.start();
        threadForFiveSeconds.start();

    }


}
