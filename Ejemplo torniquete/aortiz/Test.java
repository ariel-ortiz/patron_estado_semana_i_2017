package aortiz;

public class Test {
    
    public static void main(String[] args) {
        Turnstile t = new Turnstile();
        System.out.println(t);
        t.push();
        System.out.println(t);
        t.coin();
        System.out.println(t);
        t.coin();
        System.out.println(t);
        t.coin();
        System.out.println(t);
        t.push();
        System.out.println(t);
    }

}
