package OOPs;

class PolyA{
    public void show(){
        System.out.println("in PolyA show");
    }
}

class PolyB extends PolyA{

    public void show(){
        System.out.println("in PolyB show");
    }
}

class PolyC extends PolyA{

    public void show(){
        System.out.println("in PolyC show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PolyA obj = new PolyA();
        obj.show(); // output: in class PolyA show

        obj = new PolyB();
        obj.show(); // output: in class PolyB show

        obj = new PolyC();
        obj.show();

    }
}


// class PolyC extends PolyA{

// }