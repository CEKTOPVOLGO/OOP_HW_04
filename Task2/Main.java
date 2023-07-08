package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each,
чтобы пройти по всем элементам массива и вывести их на консоль.
В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них.
В результате мы получаем вывод на консоль элементов каждого массива.
Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных,
обеспечивая повторное использование и гибкость.
         */
        Printer printer = new Printer();
        Integer[] massInt = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printer.<Integer>print(massInt);
        System.out.println();
        String[] massStr = {"H", "e", "l", "l", "o", "!"};
        printer.<String>print(massStr);
    }

}
