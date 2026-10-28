package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader{
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number: ");
        // int num = System.in.read(); // System.in.read() returns an ASCII value


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);


        // int num = Integer.parseInt(bf.readLine());

        // subtracting 48 because it is the starting ASCII value 
        // for 0
        // System.out.println(num - 48);
        // System.out.println(num);
        // bf.close();
        // in.close();

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num);
        // sc.close();

    }
}

// ASCII value range from 0-9: 48-57