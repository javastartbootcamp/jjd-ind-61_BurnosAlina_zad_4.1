package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Wylaczony");
        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }
}
