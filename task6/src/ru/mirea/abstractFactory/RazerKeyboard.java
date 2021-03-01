package abstractFactory;

public class RazerKeyboard implements Keyboard {
    @Override
    public void getDescription() {
        System.out.println("Razer keyboard");
    }
}
