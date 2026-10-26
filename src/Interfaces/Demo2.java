package Interfaces;

interface Computer{
    void code();
}


class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run...: Faster");
    }
}

class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}

public class Demo2 {
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer himangshu = new Developer();
        himangshu.devApp(lap);
        himangshu.devApp(desk);
        
    }
}
