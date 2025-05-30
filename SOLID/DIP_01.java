package SOLID;

public class DIP_01 {

    public interface SwitchableDevice {
        void turnOn();
        void turnOff();
    }

    
    public static class LightBulb implements SwitchableDevice {
        @Override
        public void turnOn() {
            System.out.println("Light is ON!");
        }

        @Override
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    public static class Switch {
        private SwitchableDevice device;
        private boolean isOn;

        public Switch(SwitchableDevice device) {
            this.device = device;
        }

        public void operate() {
            if (isOn) {
                device.turnOff();
                isOn = false;
            } else {
                device.turnOn();
                isOn = true;
            }
        }
    }

    
    public static void main(String[] args) {
        SwitchableDevice lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate(); // Turn on
        lightSwitch.operate(); // Turn off
    }
}
