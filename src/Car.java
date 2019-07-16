public class Car {

//    public keyword is an access modifier - means unrestricted access
//      others: private & protected
//    class keyword creates a class
//    a class is a blueprint for an object

//    private for fields means your adhering to encapsulation
//    the internal representation will be hidden from view outside the class specification
//    variables are the state of a car

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("escape") || validModel.equals("crv")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

//    Why use getters and setters

}
