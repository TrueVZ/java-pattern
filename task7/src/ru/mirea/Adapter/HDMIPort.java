package Adapter;

public class HDMIPort {
    public void connect(HDMI hdmi){
        if (hdmi.getContacts() == 19) {
            System.out.println("Connected");
        } else {
            System.out.println("Error");
        }
    }
}
