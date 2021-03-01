package state;

public class ReceivedState extends State{
    @Override
    public void next(StateContext context) {
        System.out.println("Посылка уже доставлена");
    }

    @Override
    public void prev(StateContext context) {
        context.setState(new DeliveredState());

    }

    @Override
    public void printStatus() {
        System.out.println("Посылка доставлена");
    }
}
