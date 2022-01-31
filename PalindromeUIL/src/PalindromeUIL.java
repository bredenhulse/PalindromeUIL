/*
Name: Breden Hulse
Class: Computer Science 2
Program: Palindrome - says true if number is same backwards
*/
import java.io.*;
import java.util.*;
public class PalindromeUIL{
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/text.dat"));
        for(int i = scan.nextInt(); i > 0; i--){
            String number = scan.next();
            String reverse = "";
            for(int j = number.length() - 1; j >= 0; j--){//reverses number
                reverse += number.charAt(j);
            }
            System.out.println(number.equals(reverse));//print true or false
        }
	}
}
