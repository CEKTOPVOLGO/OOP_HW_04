package Task1;

public class Printer<T> {
    T printer;
    Printer(T o){
        printer = o;
    }
    void printElement(){
        System.out.println("Значение равно " + printer);
    }


}
