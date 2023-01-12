package pl.javastart.task;

public class Televisor {
    private String onOrOff;

    public Televisor(String onOrOff) {
        this.onOrOff = onOrOff;
    }

    void turnOn() {
        System.out.println("Wlaczam telewizor");
        onOrOff = "Wlaczony";
    }

    void turnOff() {
        System.out.println("Wylaczam telewizor");
        onOrOff = "Wylaczony";
    }

    void showStatus() {
        System.out.println("Telewizor jest " + onOrOff);
    }

    public String getOnOrOff() {
        return onOrOff;
    }

    public void setOnOrOff(String onOrOff) {
        this.onOrOff = onOrOff;
    }
}
