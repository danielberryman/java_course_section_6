public class InheritanceChallenge {

    public class Vehicle {

        private int weight;
        private int height;
        private int length;
        private String shape;
        private int direction;

        public Vehicle() {
        }

        public Vehicle(int weight, int height, int length, String shape) {
            this.weight = weight;
            this.height = height;
            this.length = length;
            this.shape = shape;
        }

        public void steering(int direction) {
            if(direction == 0){
                System.out.println("You are driving south.");
            } else if(direction == 1){
                System.out.println("You are driving east.");
            } else if(direction == 2){
                System.out.println("You are driving north.");
            } else {
                System.out.println("You are driving west.");
            }
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getShape() {
            return shape;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }
    }

    public class Car extends Vehicle {

        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void steering(int direction) {
            System.out.println("I'm overriding my parent class");
        }
    }
}
