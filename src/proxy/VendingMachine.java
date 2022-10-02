package proxy;

class VendingMachine {

    private final String location;
    private final int numberOfItems;

    VendingMachine(String location, int numberOfItems) {
        this.location = location;
        this.numberOfItems = numberOfItems;
    }

    String getLocation() {
        return location;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
