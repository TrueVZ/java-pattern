package abstractFactory;

public class LogitechKeyboard implements Keyboard {
    @Override
    public void getDescription() {
        System.out.println("Logitech keyboard");
    }
}
