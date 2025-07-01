package Inheritance.Thermostat_device;

public class Thermostat extends Device{
    int temperatureSetting;
    public Thermostat(String deviceId,String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }
    public void DisplayStatus(){
        super.DisplayStatus();
        System.out.println("Temperature Setting of device : "+temperatureSetting);
    }
    
}
