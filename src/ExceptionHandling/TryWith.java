package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWith {
    public static void main(String[] args){

        int num = 0;
        try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in))){
            System.out.print("Enter a number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e){
            System.out.println("error during IO operation");
        } catch(NumberFormatException e){
            System.out.println("invalid number format provided");
        }
        
    }
}
