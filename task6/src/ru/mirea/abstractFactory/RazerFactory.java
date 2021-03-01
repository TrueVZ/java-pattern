package abstractFactory;

public class RazerFactory implements PeripheryFactory {
    @Override
    public Mouse createMouse() {
        return new RazerMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }
}
