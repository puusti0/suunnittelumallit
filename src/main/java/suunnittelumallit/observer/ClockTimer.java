package suunnittelumallit.observer;

import java.util.Observable;


public class ClockTimer extends Observable {
    private  int hours, minutes, seconds;

    public ClockTimer() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
    public void tick() {
        this.seconds++;
        
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
        setChanged();
        notifyObservers();
    }  
}
