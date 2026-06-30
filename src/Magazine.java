public class Magazine
{
    private String name;
    private String publisher;
    private double price;

    public Magazine(String name, String publisher, double price) {
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public void getSummaryOfMagazine(){
        System.out.printf("The magazine %s is published by %s is priced at %.2f", name, publisher, price);
    }
}
