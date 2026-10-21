package OOPs;

abstract class AbstAnonInnerClassA {
    public abstract void show();

    public abstract void config();
}

// class AbstAnonInnerClassB extends AbstAnonInnerClassA {

// @Override
// public void show() {
// System.out.println("in B show");
// }

// }

public class AbstAnonInnerClass {
    public static void main(String[] args) {
        AbstAnonInnerClassA obj = new AbstAnonInnerClassA() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();
    }
}
