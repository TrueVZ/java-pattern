package proxy;

public class RealServer implements Server {
    public RealServer(String ip){
        tryConnect(ip);
        connect();
    }

    public void tryConnect(String ip){
        System.out.println("Connect to..." + ip);
    }
    @Override
    public void connect() {
        System.out.println("Connect");
    }
}
