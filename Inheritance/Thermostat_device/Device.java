package Inheritance.Thermostat_device;

public class Device {
    String deviceID;
    String status;
    public Device(String deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    public void DisplayStatus(){
        System.out.printf("Device ID %s status: %s",deviceID,status);
        System.out.println();
    }
}
