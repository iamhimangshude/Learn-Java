package oop;

public class ICMain {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1999", "01/01/2022");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/10/1989", "01/01/2018", 20000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = INR " + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension Check = INR " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "06/06/1982", "03/03/2018", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck= INR " + mary.collectPay());
        System.out.println("Mary's Holiday Pay= INR " + mary.getDoublePay());

    }
}
