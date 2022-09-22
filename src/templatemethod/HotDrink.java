package templatemethod;

abstract class HotDrink {

    protected abstract void brew();

    protected abstract void addExtras();

    public final void make() {
        boilWater();
        brew();
        pourIntoCup();
        if (shouldAddExtras()) {
            addExtras();
        }
        System.out.println();
    }

    protected boolean shouldAddExtras() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourIntoCup() {
        System.out.println("Pouring tea into a cup");
    }

}
