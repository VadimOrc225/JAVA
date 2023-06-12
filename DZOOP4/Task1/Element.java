package DZOOP4.Task1;


public class Element<T> { // Класс, описывающий элемент только с методами по установке поля el
    // (геттерами и сеттерами) (Принцип единственной ответственности)
    private T el;

    public Element(T el) {
        this.el = el;
    }

    public Element() {

    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }

    public void printEl(T o) {  //O — Open-Closed (Принцип открытости-закрытости)
        System.out.println(o); // класс расширен, но не модифицирован
    }
}

