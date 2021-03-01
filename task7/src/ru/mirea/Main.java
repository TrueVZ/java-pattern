import Adapter.AdapterHDMI;
import Adapter.HDMI;
import Adapter.HDMIPort;
import Adapter.USB;
import proxy.RealServer;

public class Main {
    public static void main(String[] args) {
        HDMIPort HDMIPort = new HDMIPort();
        HDMI hdmi = new HDMI();
        USB usb = new USB();
        HDMIPort.connect(hdmi);
        //HDMIPort.connect(usb);
        AdapterHDMI adapter = new AdapterHDMI(usb);
        HDMIPort.connect(adapter);

        RealServer server = new RealServer("0.0.0.0");
        server.connect();

    }

}
