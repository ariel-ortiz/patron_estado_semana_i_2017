package aortiz;

public class FireHighState implements State {

    private RoboState roboState;

    public FireHighState(RoboState roboState) {
        this.roboState = roboState;
    }

    @Override
    public void fire() {
        roboState.fire(3);
    }

    @Override
    public void goodHit() {
        // Stay here.
    }

    @Override
    public void badHit() {
        roboState.setState(roboState.getFireLow());
    }
}
