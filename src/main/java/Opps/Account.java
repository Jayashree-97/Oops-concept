package Opps;

public class Account<Amount> {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }
    public <debit> void debit(debit doubleAmount){
        int debitAmount = 1;
        if(debitAmount > balance){
            System.out.println("Debit amount Exceded Acount balance");
            System.out.println("Available balance: " + getbalance());
        }else{
            balance = balance + debitAmount;
            System.out.println("getbalance()");
        }
    }
    public double  getbalance(){
        return balance;
    }
    //Constructor
    public static  void main(String[] args){
        Account a = new Account(500);
        a.debit(700);
    }
}
