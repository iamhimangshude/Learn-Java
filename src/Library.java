import java.util.ArrayList;
import java.util.List;

public class Library<T>{
    private List<T> items = new ArrayList<>();

    public Library(T... itemsArr){
        for( T book : itemsArr){
            if (!items.contains(book)){
                items.add(book);
            }
        }
    }

    public void addBook(T book){
        if (!items.contains(book)){
            items.add(book);
        }
    }

    public List<T> getListOfBooks(){
        return this.items;
    }
}
