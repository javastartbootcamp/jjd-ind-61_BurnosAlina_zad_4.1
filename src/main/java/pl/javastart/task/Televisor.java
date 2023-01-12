package pl.javastart.task;

public class Televisor {
    private boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    void turnOn() {
        System.out.println("Wlaczam TV");
        isOn = true;
    }

    void turnOff() {
        System.out.println("Wylaczam TV");
        isOn = false;
    }

    void showStatus() {
        System.out.println("Czy TV jest wlaczony? " + isOn);
    }
}
