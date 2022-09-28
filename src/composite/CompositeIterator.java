package composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

    private final Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (!stack.isEmpty()) {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            return true;
        }
        return false;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Composite Iterator - remove");
    }
}
