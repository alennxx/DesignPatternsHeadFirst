package templatemethod.cafe;

public class Tea extends HotDrink {

    @Override
    protected void brew() {
        System.out.println("Putting a tea bag in boiling water");
    }

    @Override
    protected void addExtras() {
        System.out.println("Adding lemon to tea");
    }

}
