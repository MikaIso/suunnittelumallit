package tehtava4;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Mika
 */
public class DigitalClock implements Observer {
    
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        this.timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        if (o == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println(hour + ":" + minute + ":" + second);
    }
    
}
