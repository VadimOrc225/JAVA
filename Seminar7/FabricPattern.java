package Seminar7;

//Паттерн Фабричный метод (Factory Method) является порождающим паттерном проектирования в Java. Он позволяет динамически создавать объекты, реализующие общий интерфейс или абстрактный класс, из семейства классов без явного указания конкретного класса.
// Основная идея паттерна Фабричный метод заключается в создании абстрактного метода, называемого фабричным методом, в абстрактном классе или интерфейсе. Этот метод оставляет решение о создании конкретных объектов наследникам. Каждый конкретный наследник реализует фабричный метод и возвращает экземпляр своего класса.




// Абстрактный класс транспортного средства
abstract class Transport {
    public abstract void drive();
}

// Конкретный класс автомобиля
class Car extends Transport {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

// Конкретный класс велосипеда
class Bike extends Transport {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}

// Абстрактная фабрика
abstract class TransportFactory {
    public abstract Transport createTransport();
}

// Фабрика для создания автомобилей
class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

// Фабрика для создания велосипедов
class BikeFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}

// Клиентский код
public class FabricPattern {
    public static void main(String[] args) {
        TransportFactory factory = new CarFactory();
        Transport transport = factory.createTransport();
        transport.drive(); // Driving a car

        factory = new BikeFactory();
        transport = factory.createTransport();
        transport.drive(); // Riding a bike
    }
}
