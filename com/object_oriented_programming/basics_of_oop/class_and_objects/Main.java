class Lamp {

    // stores the values for light
    // true if light is on
    // false if light is off
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("The lamp is now ON");
    }

    void turnOff(){
        isOn = false;
        System.out.println("The lamp is now OFF");
    }
}

public class Main {

    public static void main(String[] args){

        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the led lamp
        led.turnOn();

        // turn off the halogen lamp
        halogen.turnOff();
    }
}