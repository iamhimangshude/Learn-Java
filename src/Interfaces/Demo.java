package Interfaces;


// class - class --> extends
// interface - class --> implements
// interface - interface --> extends


interface A{
    // variables declared inside interfaces are static and final
    int age = 12;   
    String area = "West Bengal";
    
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    
}

class DemoB implements A, Y{

    @Override
    public void run(){
        System.out.println("running...");
    }
    
    @Override
    public void config() {
        System.out.println("in DemoB config()");
    }

    @Override
    public void show() {
        System.out.println("in DemoB show()");
    }
    
}


public class Demo{
    public static void main(String[] args) {
        A obj;
        obj = new DemoB();
        obj.show();
        obj.config();

        X obj1 = new DemoB();
        obj1.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}