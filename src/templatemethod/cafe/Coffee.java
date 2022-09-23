package templatemethod.cafe;

public class Coffee extends HotDrink {

    private final Type type;

    public Coffee(Type type) {
        this.type = type;
    }

    @Override
    protected void brew() {
        System.out.println("Brewing and filtering coffee");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding sugar and milk to coffee");
    }

    @Override
    protected boolean shouldAddExtras() {
        return type.equals(Type.LATTE) || type.equals(Type.CAPPUCCINO);
    }

    public enum Type {
        ESPRESSO,
        BLACK,
        LATTE,
        CAPPUCCINO
    }

}
