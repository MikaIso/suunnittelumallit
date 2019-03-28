package tehtava4;

import java.util.Observable;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mika
 */
public class Subject extends Observable implements Runnable {
    
    @Override
    public void run() {
        while (true) {
            setChanged();
            notifyObservers();
            clearChanged();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Subject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
