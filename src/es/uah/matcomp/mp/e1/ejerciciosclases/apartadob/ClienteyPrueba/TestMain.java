package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.ClienteyPrueba;

public class TestMain {
    public static void main(String[] args){
        // Test Customer class
        Customer c1 = new Customer (82, "Pepito Juan", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        //Test Account class
        Account acc1 = new Account(35, c1, 2000.8);
        System.out.println(acc1);
        acc1.setBalance(1200.6);
        System.out.println(acc1);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());
        System.out.printf("balance is: %.2f%n", acc1.getBalance());
        System.out.println("the customer's name is: " + acc1.getCustomerName());
        acc1.deposit(150.56);
        System.out.printf("Customer's balance after deposit is: %.2f%n", acc1.getBalance());
        acc1.withdraw(100.45);
        System.out.printf("Customer's balance after withdraw is: %.2f%n", acc1.getBalance());
        acc1.withdraw(38497391857034.3895349);

    }
}
