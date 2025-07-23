
class BankAccount { 

    private int balance = 0; 

 
 

    // Synchronized method to ensure thread-safe deposits 

    public synchronized void deposit(int amount, String threadName) { 

        System.out.println(threadName + " is depositing $" + amount); 

        balance += amount; 

        System.out.println(threadName + " updated balance: $" + balance); 

    } 

 
 

    public int getBalance() { 

        return balance; 

    } 

} 

 
 

class DepositThread extends Thread { 

    private BankAccount account; 

    private int amount; 

 
 

    public DepositThread(BankAccount account, int amount, String name) { 

        super(name); // Set thread name 

        this.account = account; 

        this.amount = amount; 

    } 

 
 

    @Override 

    public void run() { 

        account.deposit(amount, Thread.currentThread().getName()); 

    } 

} 

 
 

public class syncr { 

    public static void main(String[] args) throws InterruptedException { 

        BankAccount account = new BankAccount(); 

 
 

        // Two threads trying to deposit at the same time 

        DepositThread t1 = new DepositThread(account, 100, "Thread-1"); 

        DepositThread t2 = new DepositThread(account, 200, "Thread-2"); 

 
 

        t1.start(); 

        t2.start(); 

 
 

        t1.join(); 

        t2.join(); 

 
 

        System.out.println("Final Balance: $" + account.getBalance()); 

    } 

} 