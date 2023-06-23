package DZOOP7.Calculator;


    public class CalculatorModel {  // модель, работающая с вещественными числами
        private double result;


        public void add(double number) {
            result += number;
        }

        public void subs(double number) {
            result -= number;
        }

        public void mult(double number) {
            result *= number;
        }

        public void division(double number) {
            try {
                result /= number;
            } catch (ArithmeticException e) {                        // обработка ошибки
                System.out.println("Ошибка! Нельзя делить на ноль!");
            }
        }
//    public void addComplex(double number){
//        result+= number;
//    }
//    public void subsComplex(double number){
//        result-= number;
//    }
//    public void multComplex(double number){
//        result*= number;
//    }
//    public void devisionComplex(double number){
//        try {
//            result/= number;
//        } catch (ArithmeticException e) {                        // обработка ошибки
//            System.out.println("Ошибка! Нельзя делить на ноль!");
//        }
//    }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }
    }



