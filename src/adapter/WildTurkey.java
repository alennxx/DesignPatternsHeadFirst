package adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Wild turkey gobbles");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey flies, but only short distance.");
    }
}
