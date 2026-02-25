public class Array {
    public static void main(String a[]) {
        System.out.println("Arrays in Java");

        // initialization of array
        // int nums[] = { 3, 7, 2, 4 };

        // using indexing* on arrays
        // System.out.println(nums[0]); // displaying the value

        // changing a value in array
        // System.out.println(nums[1]);
        // nums[1] = 6; // changing the value
        // System.out.println(nums[1]);

        // Another way of declaring an array
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // traversing an array using loop
        for (int i = 0; i < 4; i++)
            System.out.println(nums[i]);

    }
}

// * More on indexing:
/*
 * Indexing in Java starts from 0
 */