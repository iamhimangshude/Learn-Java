package oop;

public class CustomerChallenge {
    public static void main(String[] args) {
        Customer himangshu = new Customer("Himangshu", "himangshu@email.com", 100000);
        System.out.println(himangshu.getName());
        System.out.println(himangshu.getEmail());
        System.out.println(himangshu.getCreditLimit());
        
        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmail());
        System.out.println(secondCustomer.getCreditLimit());
        
        Customer thirdCustomer = new Customer("Bob", "bob@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmail());
        System.out.println(thirdCustomer.getCreditLimit());
        
    }
}
