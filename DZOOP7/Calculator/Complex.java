package DZOOP7.Calculator;

public class Complex { // модель, работающая с комплексными числами
    double real; // реальная часть
    double image; // мнимая часть

    public Complex() {

    }
    Complex(double real, double image) {   // конструктор с параметрами
        this.real = real;
        this.image = image;
    }




    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public Complex addC(Complex a) {// Сложение комплексных чисел
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex resultComplex = new Complex(0, 0);
        resultComplex.setReal(newReal);
        resultComplex.setImage(newImage);
        return resultComplex;

    }

    public Complex subC(Complex a) {// Вычитаем комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        Complex resultComplex = new Complex(0, 0);
        resultComplex.setReal(newReal);
        resultComplex.setImage(newImage);
        return resultComplex;
    }

    public Complex mulC(Complex a) {// умножить комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real * real2 - image * image2;
        double newImage = image * real2 + real * image2;
        Complex resultComplex = new Complex(0, 0);
        resultComplex.setReal(newReal);
        resultComplex.setImage(newImage);
        return resultComplex;
    }

    public Complex divC(Complex a) {// Делим комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image * real2 - real * image2) / (real2 * real2 + image2 * image2);
        Complex resultComplex = new Complex(0, 0);
        resultComplex.setReal(newReal);
        resultComplex.setImage(newImage);
        return resultComplex;
    }

}
