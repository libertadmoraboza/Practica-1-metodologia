package apartadob_introduccion;

import java.util.Arrays;

public class Book{
    private String name;
    protected Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){
        this.authors = authors;
        this.name = name;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.authors = authors;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorNames(){
        return authors[0].getName();
    }

    public String getAuthorEmail(){
        return authors[0].getEmail();
    }

    public String toString(){
        return "Book[name=" + name + ",authors=" + Arrays.toString(getAuthors()) + ",price=" + price + ",qty=" + qty + "]";
    }
}
