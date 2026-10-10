package Packages;

import Packages.tools.Calc;
import Packages.tools.AdvCalc;

public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(1, 3));
        Calc obj1 = new AdvCalc();
        System.out.println(obj1.add(1, 3));
    }

}
