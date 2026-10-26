package Annotations;

class AnnoA{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class AnnoB extends AnnoA{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}

public class Main {
    public static void main(String[] args) {
        AnnoB obj = new AnnoB();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
