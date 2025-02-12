package e1apartadob;

public class Book extends Author{
    private String name;
    private Author Author(String name, String email, char gender){
        return new Author(name, email, gender);
    }
    private double price;
    private int qty = 0;


    public Book(String name, Author author, double price){
        super(author.getName(), author.getEmail(), author.getGender());
        this.name = name;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        super(author.getName(), author.getEmail(), author.getGender());
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getBookName(){
        return name;
    }

    public Author getAuthor(){
        return new Author(getName(), getEmail(), getGender());
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

    public String getAuthorName(){
        return Author.getName();
    }

    public String getAuthorEmail(){
        return Author.getEmail();
    }

    public String toString(){
        return "Book[name=" + name + Author + ",price=" + price + ",qty=" + qty + "]";
    }
}
