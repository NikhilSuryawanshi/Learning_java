package classobject;

public class ICICI extends  Rbi{


    public ICICI(int balance) {
        super(balance);
    }

    @Override
    public int withdrawl(int amount) {
        this.balance-=amount;
        return this.balance;
    }


    @Override
    public void deposite(int amount) {
        this.balance+=amount;
    }





    @Override
    public String toString() {
        return "ICICI{" +
                "balance=" + balance +
                '}';
    }
}
