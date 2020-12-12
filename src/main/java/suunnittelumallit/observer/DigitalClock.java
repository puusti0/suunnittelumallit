package suunnittelumallit.observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private final ClockTimer timer;

    public DigitalClock(ClockTimer t) {
        this.timer = t;
        t.addObserver(this);
    }

    @Override
    public void update(Observable obj, Object arg) {
        if (obj == this.timer) {
            draw();
        }
    }
    
    private void draw() {
        System.out.println(timer.getHours() + ":" + timer.getMinutes() + ":" + timer.getSeconds());
    } 
}
