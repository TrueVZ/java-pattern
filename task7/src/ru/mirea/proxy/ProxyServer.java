package proxy;

public class ProxyServer implements Server{
    public Server server;

    public ProxyServer(Server server) {
        this.server = server;
    }
    public void proxy(){
        System.out.println("Connect from proxy server");
    }
    @Override
    public void connect() {
        proxy();
        server.connect();
    }
}
