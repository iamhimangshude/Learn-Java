class GeneralFunctions{

    int instVar;

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
    public double sub(double num1, double num2){
        return num1-num2;
    }
    public boolean greaterThan(int num1, int num2){
        return num1 > num2;
    }
    public boolean lessThan(int num1, int num2){
        return num1 < num2;
    }
    public boolean greaterThan(double num1, double num2){
        return num1 > num2;
    }
    public boolean lessThan(double num1, double num2){
        return num1 > num2;
    }
}

public class twoClassesProgram {
    public static void main(String args[]){
        System.out.println("Classes and Objects Part 2");

        GeneralFunctions obj = new GeneralFunctions();
        obj.instVar = 10; // instance variable
        boolean intGtResult = obj.greaterThan(10, 5);
        boolean doubleGtResult = obj.greaterThan(5.6f, 7.5f);
        boolean intLtResult = obj.lessThan(1, 5);
        boolean doubleLtResult = obj.lessThan(7, 6.9f);
        double doubleAdd = obj.add(5.6f, 16.9f);
        double doubleSub = obj.sub(79.8f, 56.9f);
        int intAdd = obj.add(10, 20);
        int intSub = obj.sub(30, 40);

        // Operations Output
        System.out.println(obj.instVar);
        System.out.println(intGtResult);
        System.out.println(doubleGtResult);
        System.out.println(intLtResult);
        System.out.println(doubleLtResult);
        System.out.println(intAdd);
        System.out.println(doubleAdd);
        System.out.println(intSub);
        System.out.println(doubleSub);
    }
}
