package DZOOP4.Task1;


public class Element<T> {
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

    public void printEl(T o) {  //первый вариант
        System.out.println(o);
    }

    public <T> void printElement(T a){  //второй вариант

        System.out.println(a);
    }
}
