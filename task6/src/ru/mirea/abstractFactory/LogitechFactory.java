package abstractFactory;

public class LogitechFactory implements PeripheryFactory {
    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }
}
