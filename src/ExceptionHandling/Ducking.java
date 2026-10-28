package ExceptionHandling;

public class Ducking {
    public void main(String[] args) {
        DuckA obj = new DuckA();
        try{
            obj.show();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}

class DuckA {
    public void show() throws ClassNotFoundException {
        Class.forName("ExceptionHandling.Ducking");
        System.out.println("Class found");
    }
}