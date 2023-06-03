package DZOOP1.Task1;

public class Cat implements I_Const,I_Greeting{
    private String name;
    private int age;
    private Owner host;

    String owner;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setHost(Owner host) {
        this.host = host;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Owner getHost() {
        return host;
    }


    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %s года (лет). Мой хозяин %s.\n", name, age, host.getName());
    }

    @Override
    public void greet2() { // Применяется метод интерфейса I_greeting и в нем КОНСТАНТЫ
        System.out.printf("Мяу! Меня зовут %s. У меня %d лапы и %d хвост. Мне %s года (лет). Мой хозяин %s!!! %s!!!\n",
                name, PAWS, TAIL,  age, host.getName(), ERROR);
    }
}
