package state;

public class StateContext {
    public State state;

    public StateContext() {
        state = new OrderedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void printStatus(){
        state.printStatus();
    }

    public void nextState(){
        state.next(this);
    }
}
