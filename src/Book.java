public class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookSummary(){
        return name + " by " + author + " and is priced at " + price;
    }
}
