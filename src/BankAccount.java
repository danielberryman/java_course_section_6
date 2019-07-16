public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(11111, 0, "Default name", "Default email", 1111111111);
        System.out.println("Account num: " + this.accountNumber);
        System.out.println("Empty constructor call");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email) {
        this(11111,0,customerName, email, 1111111111);
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int deposit){
        this.balance += deposit;
    }

    public void withdrawal(int withdrawal){
        if(this.balance - withdrawal >= 0){
            this.balance -= withdrawal;
        } else {
            System.out.println("insufficient funds");
        }
    }
}
