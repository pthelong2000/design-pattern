package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.addItem("1");
        concreteAggregate.addItem("2");
        concreteAggregate.addItem("3");
        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext()) {
            Object curr = iterator.next();
            System.out.println("Item: " + curr);
        }
    }
}

// Iterator
interface Iterator {
    boolean hasNext();
    Object next();
}

// Aggregate
interface Aggregate {
    Iterator createIterator();
}

// ConcreteIterator
class ConcreteIterator implements Iterator {
    private List<Object> items;
    private int position = 0;

    public ConcreteIterator(List<Object> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        Object currentItem = items.get(position);
        position++;
        return currentItem;
    }
}

// ConcreteAggregate
class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}