package aortiz;

public class SemilockedState implements State {
    
    private Turnstile turnstile;

    public SemilockedState(Turnstile turnstile) {
        this.turnstile = turnstile;
    }

    @Override
    public void coin() {
        System.out.println("Pase usted, el torniquete está abierto.");
        turnstile.setState(turnstile.getUnlocked());
    }

    @Override
    public void push() {
        System.out.println("Todavía falta insertar otra moneda.");
    }
    
    @Override
    public String toString() {        
        return "semilocked";
    }

}
