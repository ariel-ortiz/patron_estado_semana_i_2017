package aortiz;

public class FireLowState implements State {

    private RoboState roboState;

    public FireLowState(RoboState roboState) {
        this.roboState = roboState;
    }

    @Override
    public void fire() {
        roboState.fire(1);
    }

    @Override
    public void goodHit() {
        roboState.setState(roboState.getFireMid());
    }

    @Override
    public void badHit() {
        // Stay here.
    }
}
