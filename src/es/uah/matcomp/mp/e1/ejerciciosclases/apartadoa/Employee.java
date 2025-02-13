package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoa;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int i, String f, String l, int s){
        this.id = i;
        this.firstName = f;
        this.lastName = l;
        this.salary = s;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName (){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public void setSalary (int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        salary = 12 * salary * percent / 100;
        return salary;
    }


    public String toString(){
        return "Employee[id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}
