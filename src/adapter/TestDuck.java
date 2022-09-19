package adapter;

public class TestDuck {

    public static void main(String[] args) {
        WIldDuck duck = new WIldDuck();
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        System.out.println("TRUE Turkey:");
        testTurkey(turkey);

        System.out.println("TRUE duck:");
        testDuck(duck);

        System.out.println("Turkey adapter:");
        testDuck(turkeyAdapter);

        System.out.println("Duck adapter:");
        testTurkey(duckAdapter);

        //267
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
        System.out.println();
    }

}
