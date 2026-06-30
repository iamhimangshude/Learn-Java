public class Envelope<T> {
    private T content;

    public Envelope(T content){
        this.content = content;
    }

    public T getContent(){
        return this.content;
    }
}
