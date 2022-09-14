package strategy.duck;

import strategy.behavior.fly.FlyingStrategy;
import strategy.behavior.quack.QuackingStrategy;

public abstract class Duck {

    private FlyingStrategy mFlying;
    private QuackingStrategy mQuacking;

    public Duck(FlyingStrategy flying, QuackingStrategy quacking) {
        this.mFlying = flying;
        this.mQuacking = quacking;
    }

    public abstract String getName();

    public void doFly() {
        mFlying.fly();
    }

    public void doQuack() {
        mQuacking.quack();
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }

    public void setFlying(FlyingStrategy flying) {
        mFlying = flying;
    }

    public void setQuacking(QuackingStrategy quacking) {
        mQuacking = quacking;
    }

}
