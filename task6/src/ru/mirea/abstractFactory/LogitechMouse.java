package abstractFactory;

public class LogitechMouse implements Mouse {
    @Override
    public void getDescription() {
        System.out.println("Logitech mouse");
    }
}
