package ExceptionHandling;

class CustomException extends Exception{
    public CustomException(){
        super();
    }
    
    public CustomException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int[] nums = new int[5];
        String str = null;

        try {
            if (i == 0)
                throw new CustomException("Cannot divide with zero");
            j = 18 / i;
            if (j == 0)
                throw new CustomException("J's value cannot be less than 1!");
            // int len = str.length();
            // System.out.println(nums[1]);
            // System.out.println(nums[5-1]);
        } catch (CustomException e) {
            // System.out.println("Cannot divide by zero!");
            System.out.println(e);
            // j = 18 / 1;
            // System.out.println("that's the default output");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range!");
        } catch (Exception e) {
            System.out.println("something unknown went wrong!");
            System.out.println("ErrMsg: " + e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
