package Inheritance.Thermostat_device;

public class DeviceMain {
    public static void main(String[] args) {
        
    
    Device d1=new Thermostat("12355", "Active", 18);
    Device d2 = new Device("54658", "Inactive");
    
    d1.DisplayStatus();
    d2.DisplayStatus();
    }
}
