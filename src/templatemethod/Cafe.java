package templatemethod;

public class Cafe {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.make();

        Coffee blackCoffee = new Coffee(Coffee.Type.BLACK);
        blackCoffee.make();

        Coffee cappuccino = new Coffee(Coffee.Type.CAPPUCCINO);
        cappuccino.make();

        //318
    }

}
