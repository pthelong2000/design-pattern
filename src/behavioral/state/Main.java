package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());

        State endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState());
    }
}

// State
interface State {
    void doAction(Context context);
}

// ConcreteState
class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}

// ConcreteState
class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in end state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "End state";
    }
}

// Context
class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
