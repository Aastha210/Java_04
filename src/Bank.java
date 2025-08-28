public class Bank {
    private int balance=10000;
    public void withdraw(int amount){
        if(amount>balance) {
            throw new InsufficientBalanceException("Not enough Balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successfull, Remaining Balance "+ balance);
        }
    }
}