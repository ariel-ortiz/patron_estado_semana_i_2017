package aortiz;

import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

// Contexto
public class RoboState extends Robot {
    
    private State fireLow;
    private State fireMid;
    private State fireHigh;
    private State state;
    
    private boolean move = true;
    
    public RoboState() {
        fireLow = new FireLowState(this);
        fireMid = new FireMidState(this);
        fireHigh = new FireHighState(this);
        state = fireLow;
    }
    
    @Override
    public void run() {
        while (true) {
            if (move) {
                turnGunLeft(5);
            } else {
                fire();
            }
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFireLow() {
        return fireLow;
    }

    public State getFireMid() {
        return fireMid;
    }

    public State getFireHigh() {
        return fireHigh;
    }
    
    public void fire() {
        state.fire();
    }
    
    public void goodHit() {
        state.goodHit();
    }
    
    public void badHit() {
        state.badHit();
    }
    
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        move = false;
    }
    
    @Override
    public void onBulletHit(BulletHitEvent event) {
        move = false;
        goodHit();
    }
    
    @Override
    public void onBulletMissed(BulletMissedEvent event) {
        move = true;
        badHit();
    }
}
