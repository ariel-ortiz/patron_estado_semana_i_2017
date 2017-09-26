package aortiz;

public class UnlockedState implements State {

    private Turnstile turnstile;
    
    public UnlockedState(Turnstile turnstile) {
        this.turnstile = turnstile;
    }

    @Override
    public void coin() {
        System.out.println("Favor de no poner más monedas. Ya puede usted pasar.");
    }

    @Override
    public void push() {
        System.out.println("Gracias por pasar.");
        turnstile.setState(turnstile.getLocked());
    }
    
    @Override
    public String toString() {
        return "unlocked";
    }

}
