package aortiz;

// Contexto
public class Turnstile {

    private State locked;
    private State unlocked;
    private State semilocked;    

    private State state;
    
    public Turnstile() {
        locked = new LockedState(this);
        unlocked = new UnlockedState(this);
        semilocked = new SemilockedState(this);
        state = locked;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getLocked() {
        return locked;
    }

    public State getUnlocked() {
        return unlocked;
    }
    
    public State getSemilocked() {
        return semilocked;
    }
    
    public void coin() {
        state.coin();
    }
    
    public void push() {
        state.push();
    }
    
    @Override
    public String toString() {    
        return "-- Turnstile is " + state;
    }
}
