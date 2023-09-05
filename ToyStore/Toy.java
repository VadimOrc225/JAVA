package ToyStore;

import java.util.ArrayList;


    public class Toy {
        private String id;
        private String name;
        private Integer quantity;
        private Integer frequency;

        public Toy() {

        }

        public Toy(String id, String name, Integer quantity, Integer frequency) {   //три конструктора
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.frequency = frequency;
        }

        public Toy(String id, String name) {

            this.name = name;
            this.id = id;
        }
        public Toy(String id, Integer frequency) {

            this.id = id;
            this.frequency = frequency;
        }

        public Toy(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Integer getFrequency() {
            return frequency;
        }

        public void setFrequency(Integer frequency) {
            this.frequency = frequency;
        }

        public void displayInfo() {
            System.out.printf("Название игрушки: %s, Количество: %s, Вероятность появления: %d\n", getName(),
                    getQuantity(), getFrequency());
        }

        private ArrayList<Toy> catalog = new ArrayList<>();

        public void addition(Toy toy) {
            catalog.add(toy);

        }

        public boolean greeting(Toy toy) {

            for (Toy x : catalog) {
                if (toy.id.equals(x.id) && toy.name.equals(x.name)) {
                    return true;

                }

            }
            return false;
        }
    }


