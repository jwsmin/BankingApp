public class BankAccount {
    /*
    5 options for users
        check balance
        withdraw
        deposit
        check previous transaction
        exit
     */
    //keeps track of the total balance in account
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;

    BankAccount(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;

    }
    //checkbalance
    int checkBalance(){
        return balance;
    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(balance - amount >= 0){
            balance -= amount;
            previousTransaction = amount;
        }
    }

    void getTransaction(){
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrew " + previousTransaction);
        }
        else{
            System.out.println("No transaction made");
        }
    }

}
