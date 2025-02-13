package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.ClienteyPrueba;

public class Account extends Customer{
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance){
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        super(customer.getId(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
    }

    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return Math.round(balance * 100.0) / 100.0;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return customer + " balance=$" + balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public Account deposit(double amount){
        balance += amount;
        return this;
    }

    public Account withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance");
        } return this;
    }
}
