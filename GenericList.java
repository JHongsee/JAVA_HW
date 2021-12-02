package edu.pnu.collection;
import edu.pnu.admin.*;
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return size;
    }

    public void add(Beverage B) {
        data[size++] = new Beverage(B.getBeverageName(), B.getBeverageType());
    }

    public void clear() {
        Object[] newdata = new Object[DEFAULT_SIZE];
        data = newdata;
        size = 0;
    }

    public GenericIterator iterator() {
        return new GenericIterator();
    }
    public class GenericIterator {
        private int Index = 0;

        public boolean hasNext() {
            return Index < size;
        }

        public Object next() {
            return data[Index++];
        }
    }
}
