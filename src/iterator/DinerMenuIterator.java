package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] elements;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return position < elements.length && elements[position] != null;
    }

    @Override
    public MenuItem next() {
        return elements[position++];
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Forbidden");
        }
        if (elements[position - 1] != null) {
            for (int i = position - 1; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = null;
        }
    }
}
