public class Escape extends Car2 {

    private int roadServiceMonths;

    public Escape(int roadServiceMonths) {
        super("Escape", "FWD", 5, 5, 6, false, 1);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else {
            changeGear(3);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
