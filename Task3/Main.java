package Task3;

public class Main {
    public static void main(String[] args) {
        /*
Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.
В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable.
Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.
В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String).
В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.
Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов.
         */
        Integer a = 5;
        Integer b = 7;
        System.out.println(getMax(a, b));
        String strA = "A";
        String strB = "B";
        System.out.println(getMax(strA, strB));
        Double x = 5.5;
        Double y = 3.9;
        System.out.println(getMax(x, y));

    }
    static <T extends Comparable> T getMax(T a, T b){
        int result = a.compareTo(b);
        if (result == 1){
            return a;
        }
        else {
            return b;
        }
    }
}
