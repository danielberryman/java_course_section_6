public class Main {

    public static void main(String[] args) {

//        INHERITANCE

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"Long silky");
        Fish fish = new Fish("dolphin",1,1,10,32,6,2,7);

        fish.move(15);

//        dog.walk();

//        VIP CUSTOMER CHALLENGE

//        VipCustomer one = new VipCustomer();
//        VipCustomer two = new VipCustomer("Daniel", 2500);
//        VipCustomer three = new VipCustomer("Grace", 4000, "grace@mail.com");
//
//
//        System.out.println("One fields:" + one.getName() + one.getCreditLimit() + one.getEmail());
//        System.out.println("Two fields:" + two.getName() + two.getCreditLimit() + two.getEmail());
//        System.out.println("Three fields:" + three.getName() + three.getCreditLimit() + three.getEmail());

//        BANK ACCOUNT CLASS CHALLENGE

//        BankAccount graceBK = new BankAccount("Grace M", "grace@mail.com");
//        BankAccount defaultBK = new BankAccount();
//        BankAccount danielBK = new BankAccount(
//                12345,
//                0,
//                "Daniel B",
//                "daniel@mail.com",
//                2065506479);
//
//        System.out.println("Daniel has $" + danielBK.getBalance());
//        danielBK.deposit(300);
//        System.out.println("Daniel has $" + danielBK.getBalance());
//        danielBK.withdrawal(300);
//        System.out.println("Daniel has $" + danielBK.getBalance());

//        CAR CLASS CHALLENGE

//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("hello");
//        System.out.println(porsche.getModel());
    }
}
