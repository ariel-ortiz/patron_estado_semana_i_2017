package aortiz;

public class FireMidState implements State {

    private RoboState roboState;

    public FireMidState(RoboState roboState) {
        this.roboState = roboState;
    }

    @Override
    public void fire() {
        roboState.fire(2);
    }

    @Override
    public void goodHit() {
        roboState.setState(roboState.getFireHigh());
    }

    @Override
    public void badHit() {
        roboState.setState(roboState.getFireLow());
    }
}
