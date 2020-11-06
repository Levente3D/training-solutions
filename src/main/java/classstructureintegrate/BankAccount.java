package classstructureintegrate;

public class BankAccount {
    private String accountnumber;
    private String owner;
    private int balance;

    public BankAccount(String accountnumber, String owner,int balance){
        this.accountnumber = accountnumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public void transfer(BankAccount to,int amount){
        withdraw(amount);
        to.deposit(amount);
    }
    public String getInfo(){
        return owner + " (" + accountnumber + " )" + balance + " Ft";
    }

}
