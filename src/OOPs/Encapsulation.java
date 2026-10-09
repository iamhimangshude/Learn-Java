package OOPs;

public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18, "Himangshu");
        // obj.age = 11;
        // obj.name = "Himangshu";

        // obj.setAge(21);
        // obj.setName("Himangshu");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}

class Human{
    private int age; // default: 0
    private String name; // default: `null`

    public Human(){ // default constructor
        age = 12;
        name = "John";
    }
    
    public Human(int age, String name){ // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
}