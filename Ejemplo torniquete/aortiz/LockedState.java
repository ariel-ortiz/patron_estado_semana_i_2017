package aortiz;

public class LockedState implements State {

    private Turnstile turnstile;
    
    public LockedState(Turnstile turnstile) {
        this.turnstile = turnstile;
    }

    @Override
    public void coin() {
        System.out.println("Favor de insertar otra moneda.");
        turnstile.setState(turnstile.getSemilocked());
    }

    @Override
    public void push() {
        System.out.println("No puede pasar. Favor de depositar una moneda.");
    }
    
    @Override
    public String toString() {     
        return "locked";
    }

}
