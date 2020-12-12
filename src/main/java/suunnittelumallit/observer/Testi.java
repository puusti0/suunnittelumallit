package suunnittelumallit.observer;


public class Testi {
    
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(timer);
        
        for (int i=0; i<70; i++) {
            timer.tick();
        }
    }
}
