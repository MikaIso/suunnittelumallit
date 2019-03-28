package tehtava4;

import java.util.Calendar;

/**
 *
 * @author Mika
 */
public class ClockTimer extends Subject {
    
    Calendar time = Calendar.getInstance();
    
    public int getHour() {
        return time.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinute() {
        return time.get(Calendar.MINUTE);
    }
    
    public int getSecond() {
        return time.get(Calendar.SECOND);
    }
    
    public void tick() {
        super.notifyObservers();
    }
    
}
