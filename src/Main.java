public class Main{
    public static void main(String[] args){
        Envelope<String> myMsg = new Envelope<>("Hello");

        Envelope<Integer> myNum = new Envelope<>(123);

//        System.out.println(myMsg.getContent());

        Book alchemist = new Book("The Alchemist", "Paulo Cohelo", 399);
        Book atomicHabits = new Book("Atomic Habits", "James Clear", 249.99);
        Magazine time = new Magazine("Time", "Time Inc", 15.99);
        Magazine bloom = new Magazine("Bloom", "Bloomberg", 29.98);

        Library<Book> myBooks = new Library<>(alchemist, atomicHabits);
        getBookSummary(myBooks);

    }

    private static void getBookSummary(Library<Book> libArr){
        for (Book book : libArr.getListOfBooks()){
            System.out.println(book.getBookSummary());
        }
    }
}