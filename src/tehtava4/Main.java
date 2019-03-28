package tehtava4;

import java.util.Observer;

/**
 *
 * @author Mika
 */
public class Main {
    
    public static void main(String[] args) {
        
        ClockTimer timer = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer);
        
        Subject testiSubjekti = new Subject();
        testiSubjekti.addObserver(clock);
        
        new Thread(testiSubjekti).start();
        
    }
}
