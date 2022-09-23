package templatemethod.duck;

public class Duck implements Comparable<Duck> {

    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Duck o) {
        return Integer.compare(weight, o.weight);
    }

}
