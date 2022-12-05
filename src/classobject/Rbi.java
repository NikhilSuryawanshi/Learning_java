package classobject;

public abstract class Rbi {
    int balance;
    final int a=10;
    public Rbi(int balance)
    {
        this.balance=balance;
    }
    public abstract int withdrawl(int amount);
    public  abstract void deposite(int amount);
    public final void print()
    {
        System.out.println("RBI");
    }


}
