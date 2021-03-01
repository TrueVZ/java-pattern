package state;

public abstract class State {
    String orderName;

    public abstract void next(StateContext context);
    public abstract void prev(StateContext context);
    public abstract void printStatus();
}
