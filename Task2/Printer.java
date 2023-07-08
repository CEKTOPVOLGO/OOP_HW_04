package Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Printer {
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.print(item);
        }
    }
}
