package Task4;

import java.util.*;

public class DataContainer<T>{
    public List<T> list = new ArrayList();

    public void add(T a) {
        list.add(a);
    }
    public T get (int a){
        return list.get(a);
    }

    public void print() {
        for (T item: list) {
            System.out.println(item);
        }
    }

    public <T extends Comparable>void sort(boolean pn) {
        Comparator<T> comparator = (a, b) -> a.compareTo(b);
    }

}
